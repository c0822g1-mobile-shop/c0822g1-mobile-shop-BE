package com.codegym.service;

import com.codegym.model.SalesReport.ISalesReport;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface ISalesReportService {

    /**
     * Create by : DuongLTH
     * Date create 27/02/2023
     *
     * @param startDay
     * @param endDay
     */
<<<<<<< HEAD
=======

>>>>>>> origin/develop

    ISalesReport salesReport(String startDay, String endDay);

    List<ISalesReport> getAllSalesReport(String startDay, String endDay);
<<<<<<< HEAD
=======



    ISalesReport salesReportById(String startDay, String endDay, Integer id);


    List<ISalesReport> getAllSalesReportById(String startDay,  String endDay,Integer id);

>>>>>>> origin/develop
}
