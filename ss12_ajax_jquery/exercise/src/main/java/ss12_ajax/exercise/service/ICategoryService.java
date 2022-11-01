package ss12_ajax.exercise.service;

import ss12_ajax.exercise.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> getListCategory();


    void save(Category category);

    Category findById(int id);

    void remove(int id);
}
