package com.example.controller;

import com.example.dto.contract.IContractDetailDto;
import com.example.dto.customer.ICustomerDto;
import com.example.service.customer.ICustomerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/customer/v1")
public class CustomerRestController {

    private ICustomerService customerService;

//    @GetMapping("/{id}")
//    public ResponseEntity<Page<ICustomerDto>> getListContractDetail(@PathVariable Integer contractId, Pageable pageable) {
//        Page<ICustomerDto> customerDtos = customerService.getCustomerUsing(contractId,pageable);
//        if (customerDtos.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<>(customerDtos, HttpStatus.OK);
//    }

}
