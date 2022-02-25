package com.vitelco.OrderManagment.service;
import com.vitelco.OrderManagment.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    boolean login(User user);

    List<User> findAll();
    User save(User user);

    Optional<User> findById(Long id);

    Optional<User> findByEmail(String email);
}
