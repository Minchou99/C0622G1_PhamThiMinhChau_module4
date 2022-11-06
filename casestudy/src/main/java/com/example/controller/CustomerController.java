package com.example.controller;

import com.example.dto.customer.CustomerDto;
import com.example.model.customer.Customer;
import com.example.service.ICustomerService;
import com.example.service.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @Autowired
    private ICustomerTypeService customerTypeService;

    @GetMapping
    public String showList(@RequestParam(value = "searchName", defaultValue = "") String name,
                           @RequestParam(value = "searchEmail", defaultValue = "") String email,
                           @RequestParam(value = "searchCustomerType", defaultValue = "") String typeName,
                           @PageableDefault(value = 3) Pageable pageable, Model model
    ) {
        Page<Customer> customerPage = customerService.findByNameAndEmailAndCustomerType(name, email, typeName, pageable);

        model.addAttribute("customer", customerPage);
        model.addAttribute("customerType", customerTypeService.findAll());
        model.addAttribute("searchName", name);
        model.addAttribute("searchEmail", email);
        model.addAttribute("searchCustomerType", typeName);
        return "customer/list";
    }

    @GetMapping("/create")
    public String showCreateCustomer(Model model) {
        model.addAttribute("customerTypeList", customerTypeService.findAll());
        model.addAttribute("customerDto", new CustomerDto());
        return "/customer/create";
    }

    @PostMapping("/save")
    public String createCustomer(@Validated @ModelAttribute CustomerDto customerDto,
                                 BindingResult bindingResult,
                                 RedirectAttributes redirectAttributes,
                                 Model model) {
        new CustomerDto().validate(customerDto, bindingResult);

        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("customerType", customerTypeService.findAll());
            model.addAttribute("customer", customerService.findAll());
            return "/customer/create";
        } else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);

            customerService.save(customer);
            redirectAttributes.addFlashAttribute("message", "Create customer successfully !");
            return "redirect:/customer";
        }
    }

    @GetMapping("/delete")
    public String remove(@RequestParam(value = "idDelete") int id, RedirectAttributes redirect) {
        Optional<Customer> optionalCustomer = customerService.findById(id);
        if (!optionalCustomer.isPresent()) {
            redirect.addFlashAttribute("message", "Customer not found!");
        } else {
            customerService.remove(id);
            redirect.addFlashAttribute("message", "Customer removed!");
        }
        return "redirect:/customer";
    }

    @GetMapping("/{id}/edit")
    public String update(@PathVariable(value = "id") int id, Model model, RedirectAttributes redirect) {
        Optional<Customer> optionalCustomer = customerService.findById(id);
        if (!optionalCustomer.isPresent()) {
            redirect.addFlashAttribute("message", "Customer not found!");
            return "redirect:/customer";
        }
        CustomerDto customerDto = new CustomerDto();
        BeanUtils.copyProperties(optionalCustomer.get(), customerDto);
        model.addAttribute("customerDto", customerDto);
        model.addAttribute("customerType", customerTypeService.findAll());
        return "customer/edit";
    }

    @PostMapping("/edit")
    public String update(@Validated @ModelAttribute(value = "customerDto") CustomerDto customerDto,
                         BindingResult bindingResult,
                         RedirectAttributes redirect) {
        Optional<Customer> optionalCustomer = customerService.findById(customerDto.getId());
        if (!optionalCustomer.isPresent()) {
            redirect.addFlashAttribute("message", "Customer not found!");
            return "redirect:/customer";
        }
        if (!bindingResult.hasErrors()) {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);
            customerService.save(customer);
            redirect.addFlashAttribute("message", "Customer saved successfully");
            return "redirect:/customer";
        }
        redirect.addFlashAttribute("message", "Customer saved failed");
        return "redirect:/customer";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable(value = "id") int id, Model model, RedirectAttributes redirect) {
        Optional<Customer> optionalCustomer = customerService.findById(id);
        if (!optionalCustomer.isPresent()) {
            redirect.addFlashAttribute("message", "Customer not found!");
            return "redirect:/customer";
        }
        model.addAttribute("customer", optionalCustomer.get());
        return "redirect:/customer";
    }

}

