package com.example.exercise_blog.service;

import com.example.exercise_blog.model.Bloger;
import com.example.exercise_blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public void remove(Bloger blog) {
        blogRepository.delete(blog);
    }
}
