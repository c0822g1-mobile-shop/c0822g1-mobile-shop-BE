package com.codegym.controller.salesReportController;

import com.codegym.model.SalesReport.ISalesReport;
import com.codegym.service.ISalesReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController("/salesReport")
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


    @GetMapping("/{startDay}&{endDay}")
    public ResponseEntity<ISalesReport> salesReport(@PathVariable("startDay") String startDay,
                                                    @PathVariable("endDay") String endDay) {
        ISalesReport salesReport = salesReportService.salesReport(startDay,endDay);
        if (salesReport==null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(salesReport, HttpStatus.OK);
    }
}
