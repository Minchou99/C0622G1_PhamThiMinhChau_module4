package com.example.dto.contract;

import com.example.model.customer.Customer;
import com.example.model.employee.Employee;
import com.example.model.facility.Facility;


public interface IContractDto {

    Integer getId();

    String getStartDate();

    String getEndDate();

    Double getDeposit();

    String getCustomerName();

    String getFacilityName();

    Double getTotal();

}
