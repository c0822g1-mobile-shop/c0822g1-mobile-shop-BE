package com.codegym.service.impl;

import com.codegym.model.SalesReport.ISalesReport;
import com.codegym.repository.ISalesReportRepository;
import com.codegym.service.ISalesReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesReportService implements ISalesReportService {
    @Autowired
    private ISalesReportRepository salesReportRepository;


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

}
