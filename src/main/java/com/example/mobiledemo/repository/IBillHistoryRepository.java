package com.example.mobiledemo.repository;

import com.example.mobiledemo.model.BillHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

@Transactional
public interface IBillHistoryRepository extends JpaRepository<BillHistory,Integer> {
    @Query(value = "")
}
