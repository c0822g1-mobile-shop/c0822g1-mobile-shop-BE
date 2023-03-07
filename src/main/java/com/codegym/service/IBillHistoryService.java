package com.codegym.service;

import com.codegym.model.bill.BillHistory;
import com.codegym.model.bill.IBillHistory;

import java.util.List;

public interface IBillHistoryService {
    List<BillHistory> findAll(Integer id);

    List<IBillHistory> findById2(Integer id);

    /**
     * Create by: HocHH
     * Date created: 27/02/2023
     * Function: create bill(bill, commodity, user).
     *
     * @param commodityId
     */

    void addBill(Integer commodityId, Integer userId);

    /**
     * Create by: HocHH
     * Date created: 27/02/2023
     * Function: used to check user display
     *
     * @return all user
     */
    List<BillHistory>findAll();
}
