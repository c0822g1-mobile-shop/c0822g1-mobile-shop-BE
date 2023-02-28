package com.codegym.service;

import com.codegym.model.SalesReport.ISalesReport;
import org.springframework.data.repository.query.Param;

public interface ISalesReportService {

    /**
     * Create by : DuongLTH
     * Date create 27/02/2023
     * @param startDay
     * @param endDay
     */
    ISalesReport salesReport(@Param("startDay") String startDay, @Param("endDay") String endDay);
}
