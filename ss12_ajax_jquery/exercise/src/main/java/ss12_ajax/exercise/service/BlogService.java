package ss12_ajax.exercise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ss12_ajax.exercise.model.Bloger;
import ss12_ajax.exercise.repository.IBlogRepository;

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
    public Page<Bloger> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public List<Bloger> findByCategory(String nameCategory) {
        return blogRepository.findAllByCategory(nameCategory);
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
