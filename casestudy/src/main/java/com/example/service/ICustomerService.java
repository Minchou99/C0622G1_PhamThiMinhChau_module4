package com.example.service;

import com.example.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    Page<Customer> findAllByPagable(Pageable pageable);

    Customer findById(int id);

    void create(Customer customer);

    void update(Customer customer);

    void remove(Customer customer);

}
