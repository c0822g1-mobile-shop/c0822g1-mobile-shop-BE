package com.codegym.service;

import com.codegym.model.commodity.Commodity;
import org.springframework.data.repository.query.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICommodityService {
    Page<Commodity> getAllCommodity(Pageable pageable, String name);
    
    Page<Commodity> getAllCommodityNoParam(Pageable pageable);
    
    Optional<Commodity> findCommodityById(Integer id);
    
    Page<Commodity> getCommodityByQuantity(Pageable pageable);

    /**
     * Create by : DuongLTH
     * Date create 27/02/2023
     * @param QRCode
     */
    Commodity findByQRCode(String QRCode);
}
