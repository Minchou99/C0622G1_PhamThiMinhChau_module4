package com.example.app_blog.service;

import com.example.app_blog.model.Customer;

import java.util.List;

public interface ICustomerService {

    List<Customer> findAll();

    void save(Customer customer);

    void remove(Customer customer);

    void update(Customer customer);

}
