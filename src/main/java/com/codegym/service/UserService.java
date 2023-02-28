package com.codegym.service;

import com.codegym.model.user.User;
import com.codegym.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get all customer
     *
     * @param name
     * @param address
     * @param pageable
     */
    @Override
    public Page<User> findAllCustomer(Pageable pageable, String name, String address) {
        return userRepository.findAllCustomer(pageable, name, address);
    }

    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get customer by id
     *
     * @param id
     */
    @Override
    public Optional<User> findCustomerById(Integer id) {
        return userRepository.findCustomerById(id);
    }

    @Override
    public Page<User> findAllCustomerNoParam(Pageable pageable) {
        return userRepository.findAllCustomerNoParam(pageable);
    }
}
