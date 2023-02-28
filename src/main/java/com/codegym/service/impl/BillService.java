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
//    @Override
//    public void saveBill(Bill bill) {
//        iBillRepository.saveBill(bill.getPaymentMethod(),bill.getBillPrint(),bill.getUser().getName(),bill.getUser().getPhoneNumber(),bill.getUser().getAddress(), bill.getUser().getAge(), bill.getUser().getEmail());
//        Bill bill1 = iBillRepository.findByBill(bill.getId()).orElse(null);
//        for (BillHistory x : bill.getBillHistorySet()){
//            assert bill1 != null;
//            iBillRepository.insertBillHistory(bill1.getId(), x.getId());
//        }
//    }
    @Override
    public void saveBill(String paymentMethod, Boolean billPrint, String name, String phoneNumber, String address, int age, String email) {
        iBillRepository.saveBill(paymentMethod, billPrint, name, phoneNumber, address, age, email);

    }

}
