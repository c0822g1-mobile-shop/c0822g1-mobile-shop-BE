package com.codegym.service.impl;

import com.codegym.model.user.User;
import com.codegym.service.IUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService implements IUserService {
    @Override
    public Page<User> findAllCustomer(Pageable pageable, String name, String address) {
        return null;
    }

    @Override
    public Optional<User> findCustomerById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Page<User> findAllCustomerNoParam(Pageable pageable) {
        return null;
    }
}
