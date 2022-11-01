package com.example.dto;

import com.example.model.Category;

public class BlogerDto {
    private int id;
    private String name;
    private String author;
    private String dateOfPost;
    private String content;
    private Category category;

    public BlogerDto() {
    }

    public BlogerDto(int id, String name, String author, String dateOfPost, String content) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.dateOfPost = dateOfPost;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDateOfPost() {
        return dateOfPost;
    }

    public void setDateOfPost(String dateOfPost) {
        this.dateOfPost = dateOfPost;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
