package ss12_ajax.exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ss12_ajax.exercise.model.User;

public interface IUserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);
}
