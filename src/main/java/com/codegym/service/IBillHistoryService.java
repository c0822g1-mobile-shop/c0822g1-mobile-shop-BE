package com.codegym.service;

import com.codegym.model.bill.BillHistory;
import com.codegym.model.bill.IBillHistory;

import java.util.List;

public interface IBillHistoryService {
    List<BillHistory> findAll(Integer id);


    List<IBillHistory> findById2(Integer id);

}
