package com.example.dto.customer;

import com.example.model.contract.Contract;
import com.example.model.customer.CustomerType;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import java.util.Set;

public class CustomerDto implements Validator {
    private int id;
    @NotBlank(message = "Do not empty, please fill in...")
    private String name;
    @NotBlank(message = "Do not empty, please fill in...")
    private String dateOfBirth;
//    @NotBlank(message = "Do not empty, please fill in...")
    private int gender;
    @NotBlank(message = "Do not empty, please fill in...")
    private String idCard;
    @NotBlank(message = "Do not empty, please fill in...")
    private String phoneNumber;
    @NotBlank(message = "Do not empty, please fill in...")
    private String email;
    @NotBlank(message = "Do not empty, please fill in...")
    private String address;
    private int isDelete;
    private CustomerType customerType;
    private Set<Contract> contracts;

    public CustomerDto() {
    }

    public CustomerDto(int id, String name, String dateOfBirth, int gender, String idCard, String phoneNumber, String email, String address, int isDelete, CustomerType customerType, Set<Contract> contracts) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.isDelete = isDelete;
        this.customerType = customerType;
        this.contracts = contracts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
