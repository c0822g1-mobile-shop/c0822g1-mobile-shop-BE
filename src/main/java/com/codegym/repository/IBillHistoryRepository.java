package com.codegym.repository;

import com.codegym.model.bill.BillHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface IBillHistoryRepository extends JpaRepository<BillHistory, Integer> {

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
