package com.codegym.service.impl;

import com.codegym.model.Bill;
import com.codegym.repository.IBillRepository;
import com.codegym.service.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService implements IBillService {
    @Autowired
    private IBillRepository billRepository;

    @Override
    public List<Bill> findAll() {
        return billRepository.findAll();
    }
}
