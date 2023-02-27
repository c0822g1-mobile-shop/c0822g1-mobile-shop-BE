package com.example.mobiledemo.service;

import com.example.mobiledemo.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserService {
    Page<User> findAll(String genderSearch,String ageSearch,Pageable pageable);
}
