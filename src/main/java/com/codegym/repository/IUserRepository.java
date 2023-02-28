package com.codegym.repository;

import com.codegym.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface IUserRepository extends JpaRepository<User, Integer> {
    @Query(value = "select * from `user` where gender = :genderSearch and age = :ageSearch", nativeQuery = true)
    Page<User> findAll(@Param("genderSearch") String genderSearch,@Param("ageSearch") String age,  Pageable pageable);
}
