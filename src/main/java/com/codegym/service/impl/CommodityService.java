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

    @Override
    public Page<Commodity> getAllCommodity(Pageable pageable, String name) {
        return commodityRepository.getAllCommodity(pageable, name);
    }

    @Override
    public Page<Commodity> getAllCommodityNoParam(Pageable pageable) {
        return commodityRepository.getAllCommodityNoParam(pageable);
    }

    @Override
    public Optional<Commodity> findCommodityById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Page<Commodity> getCommodityByQuantity(Pageable pageable) {
        return getCommodityByQuantity(pageable);
    }

    @Override
    public Page<Commodity> searchCommodity(String name, Pageable pageable) {
        return null;
    }

    /**
     * Create by : DuongLTH
     * Date create 27/02/2023
     *
     * @param QRCode
     */

    @Override
    public Commodity findByQRCode(String QRCode) {
        return commodityRepository.findByQRCode(QRCode);
    }


}
