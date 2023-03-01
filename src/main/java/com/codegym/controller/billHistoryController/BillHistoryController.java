package com.codegym.controller.billHistoryController;

import com.codegym.model.bill.BillHistory;
import com.codegym.service.IBillHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@CrossOrigin("*")
@RequestMapping("/billHistorys")
public class BillHistoryController {
    /**
     * Created by: HuyNL
     * Date created: 1/3/2023
     * Function: get billhistory
     */
    @Autowired
    private IBillHistoryService billHistoryService;

    @GetMapping("")
    public ResponseEntity<List<BillHistory>> findAll() {
        List<BillHistory> billHistoryList = billHistoryService.findAll();
        return new ResponseEntity<>(billHistoryList, HttpStatus.OK);
    }
}
