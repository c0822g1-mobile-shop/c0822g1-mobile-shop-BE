package com.example.mobiledemo.controller;

import com.example.mobiledemo.model.User;
import com.example.mobiledemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/users")
public class UserRestController {
    //test
    @Autowired
    private IUserService userService;

    @GetMapping("search/{gender}&{age}")
    public ResponseEntity<Page<User>> findAll(@PathVariable(name = "gender") String genderSearch,
                                              @PathVariable(name = "age") String age,
                                              Pageable pageable) {
        Page<User> userPage = userService.findAll(genderSearch, age, pageable);
        return new ResponseEntity<>(userPage, HttpStatus.OK);
    }
}
