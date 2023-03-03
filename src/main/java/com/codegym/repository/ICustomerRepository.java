package com.codegym.repository;

import com.codegym.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ICustomerRepository extends JpaRepository<User, Integer> {
/*
    @Transactional
    @Modifying
    @Query(value = " insert into user ( name, " +
            " phone, " +
            " address, " +
            " age, " +
            " email )",nativeQuery = true)
    void saveCustomer(@Param("user") User customer);
*/
}
