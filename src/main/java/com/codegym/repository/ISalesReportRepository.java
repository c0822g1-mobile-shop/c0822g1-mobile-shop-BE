package com.codegym.repository;

import com.codegym.model.SalesReport.ISalesReport;
import com.codegym.model.SalesReport.SalesReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ISalesReportRepository extends JpaRepository<SalesReport,Integer> {

    /**
     * Create by : DuongLTH
     * Date create 27/02/2023
     * @param startDay
     * @param endDay
     * @return Sales report from 'startDay' to 'endDay'
     */

    @Query(value = "SELECT SUM((b.quantity * c.price) - (b.quantity * c.price)) AS revenue,\n" +
            "                        SUM(b.quantity) AS totalQuantity\n" +
            "FROM bill b\n" +
            "         JOIN bill_history bc ON b.id = bc.bill_id\n" +
            "         JOIN commodity c ON bc.commodity_id = c.id\n" +
            "         LEFT JOIN ware_housing w ON c.id = w.commodity_id\n" +
            "WHERE b.buy_date >= :startDay AND b.buy_date <= :endDay", nativeQuery = true)
    ISalesReport salesReport(@Param("startDay") String startDay, @Param("endDay") String endDay);
}