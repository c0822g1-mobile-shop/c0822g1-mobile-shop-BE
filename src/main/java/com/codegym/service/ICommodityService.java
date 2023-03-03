package com.codegym.service;

import com.codegym.model.SalesReport.ISalesReport;
import com.codegym.model.commodity.Commodity;
import org.springframework.data.repository.query.Param;

public interface ICommodityService {
    /**
     * Create by : DuongLTH
     * Date create 27/02/2023
     * @param qrCode
     */
    Commodity findByQRCode(String qrCode);
}
