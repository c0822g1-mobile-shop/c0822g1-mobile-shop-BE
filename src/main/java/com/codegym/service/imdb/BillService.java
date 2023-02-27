package com.codegym.service.imdb;


import com.codegym.model.bill.Bill;
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
    @Override
    public void saveBill(Bill bill) {
        iBillRepository.saveBill(bill);
    }
}
