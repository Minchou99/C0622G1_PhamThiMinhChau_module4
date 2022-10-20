package com.example.app_blog.repository;

import com.example.app_blog.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
