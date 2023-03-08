package com.codegym.service.impl;

import com.codegym.model.bill.BillHistory;
<<<<<<< HEAD
=======
import com.codegym.model.bill.IBillHistory;
>>>>>>> origin/develop
import com.codegym.repository.IBillHistoryRepository;
import com.codegym.service.IBillHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillHistoryService implements IBillHistoryService {

    @Autowired
<<<<<<< HEAD
=======
    private IBillHistoryRepository billHistoryRepository;

    @Override
    public List<BillHistory> findAll(Integer id) {
        return billHistoryRepository.findAll(id);
    }

    @Override
    public List<IBillHistory> findById2(Integer id) {
        return billHistoryRepository.findById2(id);
    }


    @Autowired
>>>>>>> origin/develop
    private IBillHistoryRepository iBillHistoryRepository;

    /**
     * Create by: HocHH
     * Date created: 27/02/2023
     * Function: create bill(bill, commodity, user).
     *
     * @param commodityId
     */

    @Override
    public void addBill(Integer commodityId, Integer userId) {
        iBillHistoryRepository.addBill(commodityId, userId);
    }

    /**
     * Create by: HocHH
     * Date created: 27/02/2023
     * Function: used to check user display
     *
     * @return all user
     */
    @Override
    public List<BillHistory> findAll() {
        return iBillHistoryRepository.findAll();
    }
}
