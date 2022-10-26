package com.ss9_aop.service;

import com.ss9_aop.model.OrderBook;
import com.ss9_aop.repository.IOrderBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderBookService implements IOrderBookService {
    @Autowired
    private IOrderBookRepository orderRepository;

    @Override
    public List<OrderBook> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public OrderBook findById(int id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public void save(OrderBook orderBook) {
        orderRepository.save(orderBook);
    }

    @Override
    public void remove(OrderBook orderBook) {
        orderRepository.delete(orderBook);
    }
}
