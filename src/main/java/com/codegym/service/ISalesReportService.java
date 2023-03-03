package com.codegym.service;

import com.codegym.model.SalesReport.ISalesReport;
import com.codegym.model.SalesReport.SalesReport;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ISalesReportService {

    /**
     * Create by : DuongLTH
     * Date create 27/02/2023
     * @param startDay
     * @param endDay
     */
    ISalesReport salesReport(String startDay,  String endDay);



    List<ISalesReport> getAllSalesReport(String startDay, String endDay);

}
