package com.ss9_aop.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int count;

    @OneToMany(mappedBy = "book")
    private List<OrderBook> orderBooks;

    public Book() {
    }

    public Book(int id, String name, int count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    public List<OrderBook> getOrders() {
        return orderBooks;
    }

    public void setOrders(List<OrderBook> orderBooks) {
        this.orderBooks = orderBooks;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
