package com.codegym.service;

import com.codegym.dto.billHistory.BillHistoryDTO;
import com.codegym.model.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;
import java.util.Optional;

public interface IUserService {
    Optional<User> findByUsername(String username);

    User save(User user);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get all customer
     *
     * @param name
     * @param address
     * @param pageable
     */
    Page<User> findAllCustomer(Pageable pageable, String name, String address);

    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get customer by id
     *
     * @param id
     */
    Optional<User> findCustomerById(Integer id);

    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get customer by id
     *
     * @param pageable
     */
    Page<User> findAllCustomerNoParam(Pageable pageable);

    /**
     * Created by: HuyNL
     * Date created: 27/2/2023
     * Function: get customer by id
     *
     * @param ageSearch
     * @param genderSearch
     * @param pageable
     */
    Page<User> findAll(String genderSearch, String ageSearch, Pageable pageable);

    List<BillHistoryDTO> getUserHasBuy();
}
