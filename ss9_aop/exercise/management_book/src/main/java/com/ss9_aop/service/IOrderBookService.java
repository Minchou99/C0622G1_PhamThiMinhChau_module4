package com.ss9_aop.service;

import com.ss9_aop.model.OrderBook;

import java.util.List;

public interface IOrderBookService {
    List<OrderBook> findAll();

    OrderBook findById(int id);

    void save(OrderBook orderBook);

    void remove(OrderBook orderBook);

}
