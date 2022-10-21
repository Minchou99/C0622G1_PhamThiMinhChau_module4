package com.example.service;

import com.example.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBlogService {

    void save(Blog blog);

    Blog findById(int id);

    void update(Blog blog);

    void remove(Blog blog);

    Page<Blog> findByName(String nameSearch, Pageable pageable);
}
