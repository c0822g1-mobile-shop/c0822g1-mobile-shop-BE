package com.codegym.service;

import com.codegym.model.bill.BillHistory;
<<<<<<< HEAD
=======
import com.codegym.model.bill.IBillHistory;
>>>>>>> origin/develop

import java.util.List;

public interface IBillHistoryService {
<<<<<<< HEAD
=======
    List<BillHistory> findAll(Integer id);

    List<IBillHistory> findById2(Integer id);
>>>>>>> origin/develop

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
