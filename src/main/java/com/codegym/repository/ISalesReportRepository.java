package com.codegym.repository;

import com.codegym.model.SalesReport.ISalesReport;
import com.codegym.model.SalesReport.SalesReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> origin/develop
import java.util.List;

public interface ISalesReportRepository extends JpaRepository<SalesReport,Integer> {

<<<<<<< HEAD

=======
>>>>>>> origin/develop
    /**
     * Create by : DuongLTH
     * Date create 27/02/2023
     * @param startDay
     * @param endDay
     * @return Sales report from 'startDay' to 'endDay'
     */

<<<<<<< HEAD


    @Query(value = "SELECT SUM((b.quantity * (c.price + c.price * c.interest_rate)) - (b.quantity * c.price))\n" +
=======
    @Query(value = "SELECT SUM((b.quantity * (c.price + c.price * c.interest_rate / 100)) - (b.quantity * c.price))\n" +
>>>>>>> origin/develop
            "                       AS revenue,\n" +
            "       SUM(b.quantity) AS totalQuantity\n" +
            "FROM bill b\n" +
            "         JOIN bill_history bc ON b.id = bc.bill_id\n" +
            "         JOIN commodity c ON bc.commodity_id = c.id\n" +
            "         LEFT JOIN ware_housing w ON c.id = w.commodity_id\n" +
            "WHERE (b.buy_date >= :startDay AND b.buy_date <= :endDay)", nativeQuery = true)
    ISalesReport salesReport(@Param("startDay") String startDay, @Param("endDay") String endDay);




    @Query(value = "SELECT c.id AS commodityId,\n" +
            "       SUM((b.quantity * (c.price + c.price * c.interest_rate / 100)) - (b.quantity * c.price))\n" +
            "           AS revenue,\n" +
            "       SUM(b.quantity) AS totalQuantity,\n" +
            "       b.buy_date AS buyDate\n" +
            "FROM bill b\n" +
            "         JOIN bill_history bc ON b.id = bc.bill_id\n" +
            "         JOIN commodity c ON bc.commodity_id = c.id\n" +
            "         LEFT JOIN ware_housing w ON c.id = w.commodity_id\n" +
            "WHERE (b.buy_date >= :startDay AND b.buy_date <= :endDay)\n" +
            "GROUP BY b.buy_date;", nativeQuery = true)
    List<ISalesReport> getAllSalesReport(@Param("startDay") String startDay, @Param("endDay") String endDay);




    @Query(value = "SELECT c.id AS commodityId,\n" +
            "       SUM((b.quantity * (c.price + c.price * c.interest_rate / 100)) - (b.quantity * c.price))\n" +
            "           AS revenue,\n" +
            "       SUM(b.quantity) AS totalQuantity,\n" +
            "       b.buy_date AS buyDate\n" +
            "FROM bill b\n" +
            "         JOIN bill_history bc ON b.id = bc.bill_id\n" +
            "         JOIN commodity c ON bc.commodity_id = c.id\n" +
            "         LEFT JOIN ware_housing w ON c.id = w.commodity_id\n" +
            "WHERE (b.buy_date >= :startDay AND b.buy_date <= :endDay)\n" +
            "  AND (c.id = IFNULL(:commodityId, c.id))",nativeQuery = true)
    ISalesReport salesReportById(@Param("startDay") String startDay, @Param("endDay") String endDay, @Param("commodityId") Integer id);



    @Query(value = "SELECT c.id AS commodityId,\n" +
            "       SUM((b.quantity * (c.price + c.price * c.interest_rate / 100)) - (b.quantity * c.price))\n" +
            "           AS revenue,\n" +
            "       SUM(b.quantity) AS totalQuantity,\n" +
            "       b.buy_date AS buyDate\n" +
            "FROM bill b\n" +
            "         JOIN bill_history bc ON b.id = bc.bill_id\n" +
            "         JOIN commodity c ON bc.commodity_id = c.id\n" +
            "         LEFT JOIN ware_housing w ON c.id = w.commodity_id\n" +
            "WHERE (b.buy_date >= :startDay AND b.buy_date <= :endDay)\n" +
            "  AND (c.id = IFNULL(:commodityId, c.id))\n" +
            "GROUP BY c.id, b.buy_date;", nativeQuery = true)
    List<ISalesReport> getAllSalesReportById(@Param("startDay") String startDay, @Param("endDay") String endDay, @Param("commodityId") Integer id);

}