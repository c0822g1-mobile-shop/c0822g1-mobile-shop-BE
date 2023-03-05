package com.codegym.service.impl;

import com.codegym.dto.billHistory.BillHistoryDTO;
import com.codegym.model.user.User;
import com.codegym.repository.IUserRepository;
import com.codegym.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }

    @Override
    public Boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get all customer
     *
     * @param name
     * @param address
     * @param pageable
     */
    @Override
    public Page<User> findAllCustomer(Pageable pageable, String name, String address) {
        return userRepository.findAllCustomer(pageable, name, address);
    }

    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get customer by id
     *
     * @param id
     */
    @Override
    public Optional<User> findCustomerById(Integer id) {
        return userRepository.findCustomerById(id);
    }

    @Override
    public Page<User> findAllCustomerNoParam(Pageable pageable) {
        return userRepository.findAllCustomerNoParam(pageable);
    }


    /**
     * Created by: HuyNL
     * Date created: 1/3/2023
     * Function: get customer
     */
    @Override
    public Page<User> findAll(String genderSearch, String ageSearch, Pageable pageable) {
        if (genderSearch.equals("Nam")) {
            return userRepository.findAllByGender(true, ageSearch, pageable);
        }
        if (genderSearch.equals("Nữ")) {
            return userRepository.findAllByGender(false, ageSearch, pageable);
        }
        return userRepository.findAll(genderSearch, ageSearch, pageable);
    }

    @Override
    public List<BillHistoryDTO> getUserHasBuy() {
        List<BillHistoryDTO> list = new ArrayList<>();
        for (int i = 0; i < userRepository.getUserHasBuy().size(); i++) {
            BillHistoryDTO billHistoryDTO = new BillHistoryDTO(userRepository.getUserHasBuy().get(i), userRepository.selectQuantity(userRepository.getUserHasBuy().get(i).getId()));
            list.add(billHistoryDTO);
        }
        return list;
    }
}

