package com.codegym.service;

import com.codegym.model.commodity.Commodity;
import com.codegym.repository.ICommodityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CommodityService implements ICommodityService {
    @Autowired
    private ICommodityRepository iCommodityRepository;
    @Override
    public Page<Commodity> getAllCommodity(Pageable pageable, String name) {
        return iCommodityRepository.getAllCommodity(pageable,name);
    }

    @Override
    public Page<Commodity> getAllCommodityNoParam(Pageable pageable) {
        return iCommodityRepository.getAllCommodityNoParam(pageable);
    }

    @Override
    public Optional<Commodity> findCommodityById(Integer id) {
        return iCommodityRepository.findCommodityById(id);
    }
}
