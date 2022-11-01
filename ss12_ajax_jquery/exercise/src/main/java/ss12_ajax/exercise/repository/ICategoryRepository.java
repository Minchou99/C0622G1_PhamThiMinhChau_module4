package ss12_ajax.exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ss12_ajax.exercise.model.Category;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {
}
