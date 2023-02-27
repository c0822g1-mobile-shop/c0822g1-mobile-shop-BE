package com.codegym.service;

import com.codegym.model.user.Role;
import com.codegym.model.user.RoleName;
import com.codegym.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService implements IRoleService{
  @Autowired
  private IRoleRepository iRoleRepository;
    @Override
    public Optional<Role> findByName(RoleName name) {
        return iRoleRepository.findByName(name);
    }
}
