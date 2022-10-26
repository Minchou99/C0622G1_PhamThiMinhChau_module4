package com.ss9_aop.repository;

import com.ss9_aop.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Integer> {

}
