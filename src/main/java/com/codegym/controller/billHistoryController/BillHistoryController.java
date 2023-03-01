package com.codegym.controller.billHistoryController;

import com.codegym.model.bill.BillHistory;
import com.codegym.service.IBillHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@CrossOrigin("*")
@RequestMapping("/bill-history")
public class BillHistoryController {
    /**
     * Created by: HuyNL
     * Date created: 1/3/2023
     * Function: get billhistory
     */
    @Autowired
    private IBillHistoryService billHistoryService;

    @GetMapping("/list/{id}")
    public ResponseEntity<List<BillHistory>> findAll(@PathVariable("id") Integer id) {
        List<BillHistory> billHistoryList = billHistoryService.findAll(id);
        return new ResponseEntity<>(billHistoryList, HttpStatus.OK);
    }
}
