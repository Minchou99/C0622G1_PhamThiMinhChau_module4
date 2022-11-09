package com.example.dto.contract;

import com.example.model.contract.ContractDetail;
import com.example.model.customer.Customer;
import com.example.model.employee.Employee;
import com.example.model.facility.Facility;

import java.util.Set;

public class ContractDetailDto {
    private Integer id;
    private Integer quantity;
    private Integer attachFacilityId;
    private Integer contractId;

    public ContractDetailDto() {
    }

    public ContractDetailDto(Integer id, Integer quantity, Integer attachFacilityId, Integer contractId) {
        this.id = id;
        this.quantity = quantity;
        this.attachFacilityId = attachFacilityId;
        this.contractId = contractId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getAttachFacilityId() {
        return attachFacilityId;
    }

    public void setAttachFacilityId(Integer attachFacilityId) {
        this.attachFacilityId = attachFacilityId;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }
}
