package com.example.controller;

import com.example.dto.contract.ContractDetailDto;
import com.example.model.contract.AttachFacility;
import com.example.model.contract.Contract;
import com.example.model.contract.ContractDetail;
import com.example.repository.employee.IEmployeeRepository;
import com.example.service.contract.IAttachFacilityService;
import com.example.service.contract.IContractDetailService;
import com.example.service.contract.IContractService;
import com.example.dto.contract.IContractDto;
import com.example.service.customer.ICustomerService;
import com.example.service.facility.IFacilityService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private IContractService contractService;

    @Autowired
    private IAttachFacilityService attachFacilityService;

    @Autowired
    private IContractDetailService contractDetailService;

    @Autowired
    private IFacilityService facilityService;

    @Autowired
    private ICustomerService customerService;

    @GetMapping
    public String showList(Model model, @PageableDefault(value = 3) Pageable pageable) {
        Page<IContractDto> contractServiceDtos = contractService.findAllDto(pageable);
        model.addAttribute("contracts", contractServiceDtos);
        model.addAttribute("facilityList", facilityService.findAll());
        model.addAttribute("attachFacilityList", attachFacilityService.findAll());
        model.addAttribute("contractDetailList", contractDetailService.findAll());
        model.addAttribute("customerList", customerService.findAll());
        model.addAttribute("employeeList", customerService.findAll());
        model.addAttribute("contract", new Contract());
        model.addAttribute("contractDetailDto", new ContractDetailDto());
        return "contract/list";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute Contract contract,
                       RedirectAttributes redirectAttributes) {
        contractService.save(contract);
        redirectAttributes.addFlashAttribute("message", "Add new contract successfully!");
        return "redirect:/contract";
    }

    @PostMapping("/create-contract-detail")
    public String saveDetail(@ModelAttribute ContractDetailDto contractDetailDto, RedirectAttributes redirectAttributes) {

        ContractDetail contractDetailATBC = new ContractDetail();

        Optional<Contract> contractATBC = contractService.findById(contractDetailDto.getContractId());
        Optional<AttachFacility> attachFacilityATBC =
                attachFacilityService.findById(contractDetailDto.getAttachFacilityId());

        BeanUtils.copyProperties(contractDetailDto, contractDetailATBC);

        contractDetailATBC.setContract(contractATBC.get());
        contractDetailATBC.setAttachFacility(attachFacilityATBC.get());

        contractDetailService.save(contractDetailATBC);


        redirectAttributes.addFlashAttribute("message",
                "New contract detail added successfully!");


        return "redirect:/contract";
    }

    @GetMapping("/{id}")
    public String showAttachFacility(@PathVariable Integer id, Model model) {
        model.addAttribute("contractDetails", contractDetailService.showAll(id));
        return "contract/attachList";
    }

}
