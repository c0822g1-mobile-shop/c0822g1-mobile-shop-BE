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
     */
    @Transactional
    @Modifying
    @Query(value = " insert into bill ( payment_method, " +
            " bill_print, " +
            " user_name, " +
            " user_phone_number, " +
            " user_address, " +
            " user_age, " +
            " user_email) value ( :payment_method,  :bill_print,  :user_name,  :user_phone_number, :user_address, :user_age,  :user_email) ",nativeQuery = true)
    void saveBill(@Param("payment_method") String paymentMethod, @Param("bill_print") Boolean billPrint, @Param("user_name") String name, @Param("user_phone_number") String phoneNumber, @Param("user_address") String address, @Param("user_age") int age, @Param("user_email") String email);

<<<<<<< HEAD
=======



>>>>>>> origin/develop
    /**
     * Create by: HocHH
     * Date created: 27/02/2023
     *
     * @param billId
     * @param billHistoryCommodityId
     */
    @Modifying
    @Query(value = " insert into bill_history (bill_id, bill_history_commodity_id) value (:bill_id, :bill_history_commodity_id) ",nativeQuery = true)
    void insertBillHistory(@Param("bill") int billId, @Param("bill_history") int billHistoryCommodityId);



}
