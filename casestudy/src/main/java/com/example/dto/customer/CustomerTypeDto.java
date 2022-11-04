package com.example.dto.customer;

import com.example.model.customer.Customer;

import java.util.Set;

public class CustomerTypeDto {
    private int id;
    private String name;
    private Set<Customer> customers;

    public CustomerTypeDto() {
    }

    public CustomerTypeDto(int id, String name, Set<Customer> customers) {
        this.id = id;
        this.name = name;
        this.customers = customers;
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

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}
