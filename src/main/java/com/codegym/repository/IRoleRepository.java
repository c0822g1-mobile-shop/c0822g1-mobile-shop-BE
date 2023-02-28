package com.codegym.repository;

import com.codegym.model.user.Role;
import com.codegym.model.user.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface IRoleRepository extends JpaRepository<Role,Integer> {
    Optional<Role> findByName(RoleName name);
}
