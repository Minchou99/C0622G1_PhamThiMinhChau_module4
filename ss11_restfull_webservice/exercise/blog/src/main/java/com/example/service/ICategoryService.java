package com.example.service;

import com.example.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> getListCategory();


    void save(Category category);

    Category findById(int id);

    void remove(int id);
}
