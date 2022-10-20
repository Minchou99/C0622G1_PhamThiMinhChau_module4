package com.example.exercise_blog.repository;

import com.example.exercise_blog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
}
