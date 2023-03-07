package com.codegym.controller.scanQRCodeController;

import com.codegym.model.commodity.Commodity;
import com.codegym.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/scanQR")
@CrossOrigin
public class ScanQRCodeController {

    @Autowired
    private ICommodityService commodityService;


    /**
     * Create by: DuongLTH
     * Date create 27/02/2023
     * Function scan QRCode
     * @Param : qrCode
     * Return: HttpStatus.NO_CONTENT if result is error, commodity & HttpStatus.OK if result is not error
     */

    @GetMapping("/{qrCode}")
    public ResponseEntity<Commodity> scanQRCode(@PathVariable("qrCode") String qrCode) {
        Commodity commodity = commodityService.findByQRCode(qrCode);
        if (commodity==null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(commodity, HttpStatus.OK);
    }
}
