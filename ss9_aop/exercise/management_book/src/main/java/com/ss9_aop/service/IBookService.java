package com.ss9_aop.service;

import com.ss9_aop.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBookService {

    List<Book> findAll();

//    Page<Book> findAll(Pageable pageable);

    Book findById(int id);

    void save(Book book);

    void remove(Book book);

}
