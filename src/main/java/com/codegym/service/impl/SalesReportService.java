package com.codegym.service.impl;

import com.codegym.model.SalesReport.ISalesReport;
<<<<<<< HEAD
=======
import com.codegym.model.SalesReport.SalesReport;
import com.codegym.repository.ICommodityRepository;
>>>>>>> origin/develop
import com.codegym.repository.ISalesReportRepository;
import com.codegym.service.ISalesReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class SalesReportService implements ISalesReportService {
    @Autowired
    private ISalesReportRepository salesReportRepository;


    @Autowired
    private ICommodityRepository commodityRepository;

    /**
     * Create by : DuongLTH
     * Date create 27/02/2023
     * @param startDay
     * @param endDay
     */

    @Override
    public ISalesReport salesReport(String startDay, String endDay) {
        return salesReportRepository.salesReport(startDay,endDay);
    }

    /**
     * Create by : DuongLTH
     * Date create 27/02/2023
     * @param startDay
     * @param endDay
     */
    @Override
    public List<ISalesReport> getAllSalesReport(String startDay, String endDay) {
        return salesReportRepository.getAllSalesReport(startDay, endDay);
    }


    /**
     * Create by : DuongLTH
     * Date create 27/02/2023
     * @param startDay
     * @param endDay
     * @param id
     */
    @Override
    public ISalesReport salesReportById(String startDay, String endDay, Integer id) {
        return salesReportRepository.salesReportById(startDay, endDay, id);
    }


    /**
     * Create by : DuongLTH
     * Date create 27/02/2023
     * @param startDay
     * @param endDay
     * @param id
     */
    @Override
    public List<ISalesReport> getAllSalesReportById(String startDay, String endDay, Integer id) {
        return salesReportRepository.getAllSalesReportById(startDay, endDay, id);
    }


}
