package com.codegym.repository;

import com.codegym.model.bill.BillHistory;
import com.codegym.model.bill.IBillHistory;
import com.codegym.model.bill.IBillHistoryInfo;
import com.codegym.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Repository
@Transactional
public interface IBillHistoryRepository extends JpaRepository<BillHistory, Integer> {

    /**
     * Created by: HuyNL
     * Date created: 1/3/2023
     * Function: get billhistory list
     */

    @Query(value = "select u.name,u.age,u.email,u.address,u.gender,u.dateOfBirth,u.phone_number,b.buy_date,c.name,count(c.id) as number_of_purchases ,sum(ifnull(c.price,0) * ifnull(b.quantity,0)) as tong_tien  from user u join bill b on u.id = b.id_user join bill_history bh on b.id = bh.id_bill join commodity c on c.id = bh.id_commodity group by bh.id where u.id = :id", nativeQuery = true)
    List<BillHistory> findAll(@Param("id") Integer id);


    @Query(value = "select u.name as name,u.age as age,u.gender as gender,u.email as email,u.phone_number as phoneNumber ,count(c.id) as numberOfPurchases,b.buy_date as buyDate,c.name as product,sum(ifnull(c.price,0) * ifnull(b.quantity,0)) as total from `bill_history` as  bh join `bill` b on b.id = bh.bill_id join `user` u on b.user_id = u.id join `commodity` c on c.id = bh.commodity_id  where u.id = :id group by bh.id", nativeQuery = true)
    List<IBillHistory> findById2(@Param("id") Integer id);
    /**
     * Create by: HocHH
     * Date created: 27/02/2023
     * Function: create bill(bill, commodity, user).
     *
     * @param commodityId
     * @param userId
     */

    @Modifying
    @Query(value = " insert into bill_history (commodity_id, user_id) values (:commodityId, :userId)", nativeQuery = true)
    void addBill(@Param("commodityId") Integer commodityId,
                 @Param("userId") Integer userId);

    /**
     * Create by: HocHH
     * Date created: 27/02/2023
     * Function: used to check user display
     *
     * @return all user
     */
    @Modifying
    @Query(value = " select  * from bill_history",nativeQuery = true)
    void  showHistory();

}
