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
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @Autowired
    private ICustomerTypeService customerTypeService;

    @GetMapping
    public String showList(@PageableDefault(value = 3)Pageable pageable, Model model,
                         @RequestParam(defaultValue = "") String nameSearch
    ){
        Page<Customer> customerPage = customerService.findAllByPagable(pageable);
        model.addAttribute("customer", customerPage);
        return "customer/list";
    }

    @GetMapping("/create")
    public String showCreateCustomer(Model model){
        model.addAttribute("customerTypeList",customerTypeService.findAll());
        model.addAttribute("customerDto", new CustomerDto());
        return "/customer/create";
    }

    @PostMapping("/save")
    public String createCustomer(@Validated @ModelAttribute CustomerDto customerDto,
                                 BindingResult bindingResult,
                                 RedirectAttributes redirectAttributes,
                                 Model model){
        new CustomerDto().validate(customerDto, bindingResult);

        if(bindingResult.hasFieldErrors()){
            model.addAttribute("customerType", customerTypeService.findAll());
            model.addAttribute("customer", customerService.findAll());
            return "/customer/create";
        } else{
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);

            customerService.create(customer);
            redirectAttributes.addFlashAttribute("message","Create customer: " + customer.getName() + " OK !");
            return "redirect:/customer";
        }

    }

}
