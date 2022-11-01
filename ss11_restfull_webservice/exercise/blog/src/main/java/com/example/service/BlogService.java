package com.example.service;

import com.example.model.Bloger;
import com.example.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public List<Bloger> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public void save(Bloger blog) {
        blogRepository.save(blog);
    }

    @Override
    public Bloger findById(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Bloger blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(int id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Optional<Bloger> findByIdOptional(int id) {
        return blogRepository.findById(id);
    }

    @Override
    public List<Bloger> searchByNameCategory(String keyword) {
        return blogRepository.searchByNameCategory(keyword);
    }
}
