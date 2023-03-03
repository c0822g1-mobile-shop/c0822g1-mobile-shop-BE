package com.codegym.service;

import com.codegym.model.user.Role;
import com.codegym.model.user.User;
import com.codegym.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public Optional<User> findByUsername(String username) {
        return iUserRepository.findByUsername(username);
    }

    @Override
    public void save(User user) {
         iUserRepository.save(user.getName(),user.getUsername(), user.getEmail(), user.getPassword());
        User user1 = iUserRepository.findByUsername(user.getUsername()).orElse(null);
            for (Role x: user.getRoles()) {
                assert user1 != null;
            iUserRepository.insertRole(user1.getId(), x.getId());
        }
    }

    @Override
    public Boolean existsByUsername(String username) {
        for (int i = 0; i < iUserRepository.getAllUser().size(); i++) {
            if (iUserRepository.getAllUser().get(i).getUsername().equals(username)) {
                return true;
            }
        }
        return false;

    }

    @Override
    public Boolean existsByEmail(String email) {
        for (int i = 0; i < iUserRepository.getAllUser().size(); i++) {
            if (iUserRepository.getAllUser().get(i).getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<User> findAll() {
        return iUserRepository.getAllUser();
    }

    @Override
    public List<User> findAllCustomer() {
        return iUserRepository.findAllCustomer();
    }

    @Override
    public List<User> findAllEmployee() {
        return iUserRepository.findAllEmployee();
    }

    @Override
    public List<User> findAllAdmin() {
        return iUserRepository.findAllAdmin();
    }


}
