package com.example.exercise_blog.service;

import com.example.exercise_blog.model.Blog;
import com.example.exercise_blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Blog blog) {
        blogRepository.delete(blog);
    }
}
