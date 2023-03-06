package com.codegym.controller.billHistoryController;

import com.codegym.dto.billHistory.BillHistoryDTO;
import com.codegym.model.bill.IBillHistory;
import com.codegym.service.IBillHistoryService;
import com.codegym.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("bill-history")
public class BillHistoryController {
    /**
     * Created by: HuyNL
     * Date created: 1/3/2023
     * Function: get billhistory
     */
    @Autowired
    private IBillHistoryService billHistoryService;

    @Autowired
    private IUserService iUserService;

    @GetMapping("/list")
    public ResponseEntity<List<BillHistoryDTO>> findAll() {
        List<BillHistoryDTO> billHistoryList = iUserService.getUserHasBuy();
        return new ResponseEntity<>(billHistoryList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Integer id) {
        List<IBillHistory> billHistorys = billHistoryService.findById2(id);
        return new ResponseEntity<>(billHistorys, HttpStatus.OK);
    }


}
