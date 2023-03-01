package com.codegym.service.impl;

import com.codegym.model.bill.BillHistory;
import com.codegym.repository.IBillHistoryRepository;
import com.codegym.service.IBillHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillHistoryService  implements IBillHistoryService {
    @Autowired
    private IBillHistoryRepository billHistoryRepository;

    @Override
    public List<BillHistory> findAll(Integer id) {
        return billHistoryRepository.findAll(id);
    }
}
