package com.ss9_aop.service;

import com.ss9_aop.model.Book;
import com.ss9_aop.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

//    @Override
//    public Page<Book> findAll(Pageable pageable) {
//        return bookRepository.findAll(pageable);
//    }

    @Override
    public Book findById(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void remove(Book book) {
        bookRepository.delete(book);
    }
}
