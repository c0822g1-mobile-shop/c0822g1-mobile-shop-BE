package com.codegym.service;

import com.codegym.model.BillHistory;

import java.util.List;

public interface IBillHistoryService {
    List<BillHistory> findAll();
}
