package com.codegym.repository;

import com.codegym.model.bill.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public interface IBillRepository extends JpaRepository<Bill, Integer> {


    @Query(value = "select * from bill where id = :billId", nativeQuery = true)
    Optional<Bill> findByBill(@Param("billId") Integer billId);

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
            " user_email) value ( :payment_method,  :bill_print,  :user_name,  :user_phone_number, :user_address, :user_age,  :user_email)",nativeQuery = true)
    void saveBill(@Param("payment_method") String paymentMethod, @Param("bill_Print") Boolean billPrint, @Param("name") String name, @Param("phone_number") String phoneNumber, @Param("address") String address, @Param("age") int age, @Param("email") String email);

    @Modifying
    @Query(value = "insert into bill_history (bill_id, bill_history_id) value (:bill_id, :bill_history_id)",nativeQuery = true)
    void insertBillHistory(@Param("bill") int billId, @Param("bill_history") int billHistoryId);

//    void saveBill(String paymentMethod, Boolean billPrint, String name, String phoneNumber, String address, int age, String email);
}
