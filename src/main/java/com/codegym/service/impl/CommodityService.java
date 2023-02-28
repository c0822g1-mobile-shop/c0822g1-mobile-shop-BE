package com.codegym.service.impl;

import com.codegym.model.SalesReport.ISalesReport;
import com.codegym.model.commodity.Commodity;
import com.codegym.repository.ICommodityRepository;
import com.codegym.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommodityService implements ICommodityService {
    @Autowired
    private ICommodityRepository commodityRepository;

    /**
     * Create by : DuongLTH
     * Date create 27/02/2023
     * @param QRCode
     */

    @Override
    public Commodity findByQRCode(String QRCode) {
        return commodityRepository.findByQRCode(QRCode);
    }


}
