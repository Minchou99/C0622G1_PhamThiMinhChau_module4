package com.example.service;

import com.example.model.Bloger;

import java.util.List;
import java.util.Optional;

public interface IBlogService {

    List<Bloger> findAll();

    void save(Bloger blog);

    Bloger findById(int id);

    void update(Bloger blog);

    void remove(int id);

    Optional<Bloger> findByIdOptional(int id);

    public List<Bloger> searchByNameCategory(String keyword);
}
