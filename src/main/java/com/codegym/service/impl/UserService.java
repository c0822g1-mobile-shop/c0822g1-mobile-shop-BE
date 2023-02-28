package com.codegym.service.impl;

//<<<<<<< HEAD
import com.codegym.model.user.Role;
import com.codegym.model.user.User;
import com.codegym.repository.IUserRepository;
import com.codegym.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository iUserRepository;
    /**
     * Created by: CuongVV
     * Date created: 28/2/2023
     * Function: find user by username
     * @param:username
     **/
    @Override
    public Optional<User> findByUsername(String username) {
        return iUserRepository.findByUsername(username);
    }
    /**
     * Created by: CuongVV
     * Date created: 28/2/2023
     * Function: insert into user to register account
     * @param:name,username,password,email
     **/
    @Override
    public void save(User user) {
         iUserRepository.save(user.getName(),user.getUsername(), user.getEmail(), user.getPassword());
        User user1 = iUserRepository.findByUsername(user.getUsername()).orElse(null);
            for (Role x: user.getRoles()) {
                assert user1 != null;
            iUserRepository.insertRole(user1.getId(), x.getId());
        }
    }
    /**
     * Created by: CuongVV
     * Date created: 28/2/2023
     * Function: check exists user by username
     * @param:username
     **/
    @Override
    public Boolean existsByUsername(String username) {
        for (int i = 0; i < iUserRepository.getAllUser().size(); i++) {
            if (iUserRepository.getAllUser().get(i).getUsername().equals(username)) {
                return true;
            }
        }
        return false;

    }
    /**
     * Created by: CuongVV
     * Date created: 28/2/2023
     * Function: check exists user by email
     * @param:email
     **/
    @Override
    public Boolean existsByEmail(String email) {
        for (int i = 0; i < iUserRepository.getAllUser().size(); i++) {
            if (iUserRepository.getAllUser().get(i).getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
    /**
     * Created by: CuongVV
     * Date created: 28/2/2023
     * Function: get all user
     * @param:none
     **/
    @Override
    public List<User> findAll() {
        return iUserRepository.getAllUser();
    }
    /**
     * Created by: CuongVV
     * Date created: 28/2/2023
     * Function: get all user customer
     * @param:email
     **/
    @Override
    public List<User> findAllCustomer() {
        return iUserRepository.findAllCustomer();
    }
    /**
     * Created by: CuongVV
     * Date created: 28/2/2023
     * Function: get all user employee
     * @param:email
     **/
    @Override
    public List<User> findAllEmployee() {
        return iUserRepository.findAllEmployee();
    }
    /**
     * Created by: CuongVV
     * Date created: 28/2/2023
     * Function: get all user admin
     * @param:none
     **/
    @Override
    public List<User> findAllAdmin() {
        return iUserRepository.findAllAdmin();
    }



    @Autowired
    private IUserRepository userRepository;

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

}
