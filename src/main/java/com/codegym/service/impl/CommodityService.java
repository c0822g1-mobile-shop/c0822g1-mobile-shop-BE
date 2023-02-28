package com.codegym.service.impl;

import com.codegym.model.Commodity;
import com.codegym.repository.ICommodityRepository;
import com.codegym.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityService implements ICommodityService {
    @Autowired
    private ICommodityRepository commodityRepository;

    @Override
    public List<Commodity> findAll() {
        return commodityRepository.findAll();
    }
}
