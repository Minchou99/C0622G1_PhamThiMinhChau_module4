package ss12_ajax.exercise.service;

import ss12_ajax.exercise.model.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    User findById(int id);
}
