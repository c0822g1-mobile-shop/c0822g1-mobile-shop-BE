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
    @GetMapping("/{QRCode}")
    public ResponseEntity<Commodity> scanQRCode(@PathVariable("QRCode") String QRCode) {
        Commodity commodity = commodityService.findByQRCode(QRCode);
        if (commodity==null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        }
        return new ResponseEntity<>(commodity, HttpStatus.OK);
    }
}
