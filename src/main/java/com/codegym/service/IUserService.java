package com.codegym.service;

import com.codegym.model.user.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    Optional<User> findByUsername(String username);
    void save(User user);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    List<User> findAll();
    List<User> findAllCustomer();
    List<User> findAllEmployee();
    List<User> findAllAdmin();
}
