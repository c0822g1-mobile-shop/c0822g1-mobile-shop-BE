package com.codegym.repository;

import com.codegym.model.bill.BillHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IBillHistoryRepository extends JpaRepository<BillHistory, Integer> {

    /**
     * Created by: HuyNL
     * Date created: 1/3/2023
     * Function: get billhistory list
     */

    @Query(value = "select u.name,u.age,u.email,u.address,u.gender,u.dateOfBirth,u.phone_number,b.buy_date,c.name,count(c.id) as so_lan_mua ,sum(ifnull(c.price,0) * ifnull(b.quantity,0)) as tong_tien  from user u join bill b on u.id = b.id_user join bill_history bh on b.id = bh.id_bill join commodity c on c.id = bh.id_commodity group by bh.id where u.id = :id", nativeQuery = true)
    List<BillHistory> findAll(@Param("id") Integer id);

}
