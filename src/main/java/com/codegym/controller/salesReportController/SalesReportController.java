package com.codegym.controller.salesReportController;

import com.codegym.model.SalesReport.ISalesReport;
import com.codegym.service.ISalesReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/salesReport")
public class SalesReportController {

    @Autowired
    private ISalesReportService salesReportService;


    /**
     * Create by: DuongLTH
     * Date create 27/02/2023
     * Function Sales report
     * @Param : startDay, endDay
     * Return: HttpStatus.NO_CONTENT if result is error, salesReport & HttpStatus.OK if result is not error
     */


    @GetMapping("/sales/{startDay}&{endDay}")
    public ResponseEntity<ISalesReport> salesReport(@PathVariable("startDay") String startDay,
                                                    @PathVariable("endDay") String endDay) {
        ISalesReport salesReport = salesReportService.salesReport(startDay,endDay);
        if (salesReport==null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(salesReport, HttpStatus.OK);
    }


    @GetMapping("/getAll/{startDay}&{endDay}")
    public ResponseEntity<List<ISalesReport>> getAllSalesReport(@PathVariable("startDay") String startDay,
                                                                @PathVariable("endDay") String endDay) {
        List<ISalesReport> reportList = salesReportService.getAllSalesReport(startDay,endDay);
        if (reportList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(reportList, HttpStatus.OK);
    }



    @GetMapping("/salesById/{startDay}&{endDay}&{commodityId}")
    public ResponseEntity<ISalesReport> salesReportById(@PathVariable("startDay") String startDay,
                                                    @PathVariable("endDay") String endDay,
                                                    @PathVariable("commodityId") Integer commodityId) {
        ISalesReport salesReport = salesReportService.salesReportById(startDay,endDay,commodityId);
        if (salesReport==null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(salesReport, HttpStatus.OK);
    }


    @GetMapping("/getAllById/{startDay}&{endDay}&{commodityId}")
    public ResponseEntity<List<ISalesReport>> getAllSalesReportById(@PathVariable("startDay") String startDay,
                                                                @PathVariable("endDay") String endDay,
                                                                @PathVariable("commodityId") Integer commodityId) {
        List<ISalesReport> reportList = salesReportService.getAllSalesReportById(startDay,endDay,commodityId);
        if (reportList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(reportList, HttpStatus.OK);
    }



}
