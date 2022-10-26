package com.ss9_aop.repository;

import com.ss9_aop.model.OrderBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderBookRepository extends JpaRepository<OrderBook, Integer> {
}
