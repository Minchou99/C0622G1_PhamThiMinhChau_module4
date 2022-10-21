package com.example.exercise_blog.service;

import com.example.exercise_blog.model.Bloger;

import java.util.List;

public interface IBlogService {

    List<Bloger> findAll();

    void save(Bloger blog);

    Bloger findById(int id);

    void update(Bloger blog);

    void remove(Bloger blog);
}
