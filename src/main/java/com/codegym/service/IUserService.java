package com.codegym.service;

<<<<<<< HEAD
import com.codegym.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserService {
    Page<User> findAll(String genderSearch,String ageSearch,Pageable pageable);
=======
import com.codegym.model.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IUserService {
    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get all customer
     * @param name
     * @param address
     * @param pageable
     */
    Page<User> findAllCustomer(Pageable pageable, String name, String address);

    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get customer by id
     * @param id
     */
    Optional<User> findCustomerById(Integer id);

    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get customer by id
     * @param pageable
     */
    Page<User> findAllCustomerNoParam(Pageable pageable);
>>>>>>> origin/develop
}
