package com.codegym.repository;

import com.codegym.model.BillHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface IBillHistoryRepository extends JpaRepository<BillHistory, Integer> {
    @Query(value = "select u.name,u.age,u.email,u.address,u.gender,u.dateOfBirth,u.phone_number,b.buy_date,c.name,count(c.id) as so_lan_mua ,sum(ifnull(c.price,0) * ifnull(b.quantity,0)) as tong_tien  from user u join bill b on u.id = b.id_user join bill_history bh on b.id = bh.id_bill join commodity c on c.id = bh.id_commodity group by bh.id", nativeQuery = true)
    List<BillHistory> findAll();
}
