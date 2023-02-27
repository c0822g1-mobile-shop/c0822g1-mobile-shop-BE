package com.codegym.service;

import com.codegym.model.bill.Bill;

public interface IBillService {

    /**
     * Create by: HocHH
     * Date created: 27/02/2023
     * Function: create bill by id
     *
     * @param bill
     */
    void saveBill(Bill bill);
}
