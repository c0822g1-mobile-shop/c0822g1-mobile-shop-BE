package com.codegym.service;

import com.codegym.model.bill.BillHistory;

import java.util.List;

public interface IBillHistoryService {
    List<BillHistory> findAll(Integer id);

}
