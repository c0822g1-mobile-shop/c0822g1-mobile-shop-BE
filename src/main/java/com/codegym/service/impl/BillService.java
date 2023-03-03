package com.codegym.service.impl;


import com.codegym.model.bill.Bill;
import com.codegym.model.bill.BillHistory;
import com.codegym.model.commodity.Commodity;
import com.codegym.repository.IBillRepository;
import com.codegym.service.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public class BillService implements IBillService {
    @Autowired
    private IBillRepository iBillRepository;


    /**
     * Create by: HocHH
     * Date created: 27/02/2023
     * Function: create bill by id
     *
     * @param
     */
    @Override
    public void saveBill(String paymentMethod, Boolean billPrint, String name, String phoneNumber, String address, int age, String email) {
        iBillRepository.saveBill(paymentMethod, billPrint, name, phoneNumber, address, age, email);

    }
}
