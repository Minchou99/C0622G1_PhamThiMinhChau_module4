package ss12_ajax.exercise.service;

import org.springframework.beans.factory.annotation.Autowired;
import ss12_ajax.exercise.model.Category;
import ss12_ajax.exercise.repository.ICategoryRepository;

import java.util.List;

public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public List<Category> getListCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public Category findById(int id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(int id) {
        categoryRepository.deleteById(id);
    }
}
