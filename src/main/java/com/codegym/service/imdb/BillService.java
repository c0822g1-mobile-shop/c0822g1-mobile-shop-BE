package com.codegym.service.imdb;


import com.codegym.model.bill.Bill;
import com.codegym.model.commodity.Commodity;
import com.codegym.repository.IBillRepository;
import com.codegym.service.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
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
     * @param bill
     */
//    @Override
//    public void saveBill(Bill bill) {
//        iBillRepository.saveBill(bill.getPaymentMethod(),bill.getBillPrint(),bill.getUser().getName(),bill.getUser().getPhoneNumber(),bill.getUser().getAddress(), bill.getUser().getAge(), bill.getUser().getEmail());
//        Bill bill1 = iBillRepository.findByBill(bill.getId()).orElse(null);
//        for (Commodity x : bill.)
//    }
}
