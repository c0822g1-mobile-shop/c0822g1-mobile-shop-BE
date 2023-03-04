package com.codegym.controller;

import com.codegym.model.bill.BillHistory;
import com.codegym.service.IBillHistoryService;
import com.codegym.service.IBillService;
import com.codegym.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/bill")
@CrossOrigin("*")
public class BillRestController {
    @Autowired
    private IBillService iBillService;

    @Autowired
    private ICustomerService iCustomerService;

    @Autowired
    private IBillHistoryService iBillHistoryService;

    /**
     * Create by: HocHH
     * Date created: 27/02/2023
     * Function: create bill
     *
     * @param commodityId
     * @param userId
     * @return
     */
    @GetMapping("/add-bill/{commodityId}&{userId}")
    public ResponseEntity<BillHistory> createBillHistory(@PathVariable("commodityId") Integer commodityId,
                                                  @PathVariable("userId") Integer userId){
        iBillHistoryService.addBill(commodityId, userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Create by: HocHH
     * Date created: 27/02/2023
     * Function: used to check user display
     *
     * @return all user
     */
    @GetMapping("/show")
    public ResponseEntity<Object> showHistory(){
        return new ResponseEntity<>(iBillHistoryService.findAll(), HttpStatus.OK);
    }
}
