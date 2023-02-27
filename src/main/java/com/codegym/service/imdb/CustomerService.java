package com.codegym.service.imdb;


import com.codegym.model.user.User;
import com.codegym.repository.ICustomerRepository;
import com.codegym.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;

/*
    @Override
    public void saveCustomer(User user) {
        iCustomerRepository.saveCustomer(user);
    }
*/
}
