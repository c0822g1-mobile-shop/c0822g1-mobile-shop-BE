package com.codegym.controller;

import com.codegym.dto.BillDto;
import com.codegym.model.bill.Bill;
import com.codegym.model.bill.BillHistory;
import com.codegym.service.IBillService;
import com.codegym.service.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/api/bill")
@CrossOrigin("*")
public class BillRestController {
    @Autowired
    private IBillService iBillService;

    @Autowired
    private ICustomerService iCustomerService;

    /**
     * Create by: HocHH
     * Date created: 27/02/2023
     * Function: create bill by id
     *
     * @param billDto
     * @param bindingResult
     * @return HttpStatus.BAD_REQUEST if result is error or HttpStatus.OK if result is not error
     */
    @PostMapping("/save")
    public ResponseEntity<BillDto> saveBill(@Valid @RequestBody BillDto billDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ResponseEntity<BillDto>(HttpStatus.BAD_REQUEST);
        }
        Bill bill = new Bill();


//        Set<String> strBillHistory =
//        Set<BillHistory> billHistorySet = new HashSet<>();
//        strBillHistory.forEach


        BeanUtils.copyProperties(billDto,bill);
        iBillService.saveBill(bill.getPaymentMethod(),bill.getBillPrint(), bill.getUser().getName(), bill.getUser().getPhoneNumber(), bill.getUser().getAddress(), bill.getUser().getAge(), bill.getUser().getEmail());
        return new ResponseEntity<BillDto>(HttpStatus.OK);
    }
}
