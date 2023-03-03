package com.codegym.service.impl;

import com.codegym.model.commodity.Commodity;
import com.codegym.repository.ICommodityRepository;
import com.codegym.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommodityService implements ICommodityService {
    @Autowired
    private ICommodityRepository commodityRepository;
    @Autowired
    private ICommodityRepository iCommodityRepository;

    /**
     * Create by : DuongLTH
     * Date create 27/02/2023
     *
     * @param:QRCode
     */

    @Override
    public Commodity findByQRCode(String QRCode) {
        return commodityRepository.findByQRCode(QRCode);
    }


    @Override
    public Page<Commodity> getAllCommodity(Pageable pageable, String name) {
        return iCommodityRepository.getAllCommodity(pageable, name);
    }

    @Override
    public Page<Commodity> getAllCommodityNoParam(Pageable pageable) {
        return iCommodityRepository.getAllCommodityNoParam(pageable);
    }

    @Override
    public Optional<Commodity> findCommodityById(Integer id) {
        return iCommodityRepository.findCommodityById(id);
    }

    @Override
    public Page<Commodity> getCommodityByQuantity(Pageable pageable) {
        return commodityRepository.getCommodityByQuantity(pageable, 20);
    }
}
