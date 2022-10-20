package com.example.exercise_blog.service;

import com.example.exercise_blog.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    Blog findById(int id);

    void update(Blog blog);

    void remove(Blog blog);
}
