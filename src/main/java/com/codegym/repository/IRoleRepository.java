package com.codegym.repository;

import com.codegym.model.user.Role;
import com.codegym.model.user.RoleName;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface IRoleRepository {
    Optional<Role> findByName(RoleName name);
}
