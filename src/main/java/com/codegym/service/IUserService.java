package com.codegym.service;

import com.codegym.model.user.User;

import java.util.Optional;

public interface IUserService {
    Optional<User> findByUsername(String username);
    User save(User user);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}
