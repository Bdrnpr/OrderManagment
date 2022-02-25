package com.vitelco.todolist.service;
import com.vitelco.todolist.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    boolean login(User user);

    List<User> findAll();
    User save(User user);

    Optional<User> findById(Long id);

    Optional<User> findByEmail(String email);
}
