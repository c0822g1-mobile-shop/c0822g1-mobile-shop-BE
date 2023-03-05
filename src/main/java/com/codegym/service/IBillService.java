package com.codegym.service;

import com.codegym.model.bill.Bill;
import org.springframework.data.repository.query.Param;

public interface IBillService {

    /**
     * Create by: HocHH
     * Date created: 27/02/2023
     * Function: create bill by id
     *
     * @param
     */
    void saveBill(String paymentMethod,  Boolean billPrint,  String name,  String phoneNumber,  String address, int age,  String email);

}
