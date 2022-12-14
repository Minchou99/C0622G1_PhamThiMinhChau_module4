package com.example.dto.customer;

import com.example.model.contract.Contract;
import com.example.model.customer.CustomerType;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Set;

public class CustomerDto implements Validator {

    private Integer id;

    @NotBlank(message = "Do not empty, please fill in...")
    @Pattern(regexp = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$",
            message = "Invalid format (ex: Phạm Thị Minh Châu)")
    private String name;

    @NotBlank(message = "Do not empty, please fill in...")
    private String dateOfBirth;

    private Integer gender;

    @NotBlank(message = "Do not empty, please fill in...")
    @Pattern(regexp = "^(\\d{9}|\\d{12})$", message = "Invalid Id card (ex: 123456789)")
    private String idCard;

    @NotBlank(message = "Do not empty, please fill in...")
    @Pattern(regexp = "^(090|091|\\(\\+84\\)90|\\(\\+84\\)91)\\d{7}$",message = "Invalid phone number (ex: 090/091XXXXXXX (+84)90/91XXXXXXX)")
    private String phoneNumber;

    @NotBlank(message = "Do not empty, please fill in...")
    private String email;

    @NotBlank(message = "Do not empty, please fill in...")
    private String address;

    private Integer isDelete;

    private CustomerType customerType;

    private Set<Contract> contracts;

    public CustomerDto() {
    }

    public CustomerDto(Integer id, String name, String dateOfBirth, Integer gender, String idCard, String phoneNumber, String email, String address, Integer isDelete, CustomerType customerType, Set<Contract> contracts) {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
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

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
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
        CustomerDto customerDto = (CustomerDto) target;

        if(!customerDto.getEmail().matches("^[A-Za-z0-9]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")){
            errors.rejectValue("email","email.matches", "email invalid, please fill in ... (ex: abc@gmail.com)");
        }
    }
}
