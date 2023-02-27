package com.codegym.service;

import com.codegym.model.user.Role;
import com.codegym.model.user.RoleName;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService implements IRoleService{


    @Override
    public Optional<Role> findByName(RoleName name) {
        return Optional.empty();
    }
}
