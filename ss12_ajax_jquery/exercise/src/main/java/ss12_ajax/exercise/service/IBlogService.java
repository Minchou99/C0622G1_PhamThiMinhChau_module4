package ss12_ajax.exercise.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ss12_ajax.exercise.model.Bloger;

import java.util.List;
import java.util.Optional;

public interface IBlogService {

    List<Bloger> findAll();

    Page<Bloger> findAll(Pageable pageable);

    List<Bloger> findByCategory(String nameCategory);

    void save(Bloger blog);

    Bloger findById(int id);

    void update(Bloger blog);

    void remove(int id);

    Optional<Bloger> findByIdOptional(int id);

    public List<Bloger> searchByNameCategory(String keyword);
}
