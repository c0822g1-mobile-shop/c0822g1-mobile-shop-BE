package com.codegym.repository;

import com.codegym.model.bill.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IBillRepository extends JpaRepository<Bill, Integer> {


    /**
     * Create by: HocHH
     * Date created: 27/02/2023
     * Function: create bill by id
     *
     * @param bill
     */
    @Transactional
    @Modifying
    @Query(value = " insert into bill (money_total, " +
            " payment_method, " +
            " billPrint, " +
            " user_name, " +
            " user_phone, " +
            " user_address, " +
            " user_age, " +
            " user_email, " +
            " commodity_name, " +
            " commodity_price, " +
            " commodity_quantity )",nativeQuery = true)
    void saveBill(@Param("bill") Bill bill);


}
