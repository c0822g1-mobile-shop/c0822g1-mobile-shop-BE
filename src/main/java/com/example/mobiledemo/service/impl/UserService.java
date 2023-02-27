package com.example.mobiledemo.service.impl;

import com.example.mobiledemo.model.User;
import com.example.mobiledemo.repository.IUserRepository;
import com.example.mobiledemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;


    @Override
    public Page<User> findAll(String genderSearch,String ageSearch,Pageable pageable) {
        return userRepository.findAll(genderSearch,ageSearch,pageable);
    }
}
