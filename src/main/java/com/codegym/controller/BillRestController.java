package com.codegym.controller;

import com.codegym.dto.BillDto;
import com.codegym.model.bill.Bill;
import com.codegym.service.IBillService;
import com.codegym.service.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
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
     * @return
     */
    @PostMapping("save")
    public ResponseEntity<BillDto> saveBill(@Valid @RequestBody BillDto billDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ResponseEntity<BillDto>(HttpStatus.NOT_ACCEPTABLE);
        }
        Bill bill = new Bill();
        BeanUtils.copyProperties(billDto,bill);
        return new ResponseEntity<BillDto>(HttpStatus.OK);
    }
}
