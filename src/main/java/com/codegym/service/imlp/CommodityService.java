package com.codegym.service.imlp;

import com.codegym.model.commodity.Commodity;
import com.codegym.repository.ICommodityRepository;
import com.codegym.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CommodityService implements ICommodityService {
    @Autowired
    private ICommodityRepository commodityRepository;
    @Override
    public Page<Commodity> findAll(Pageable pageable) {
        return commodityRepository.showListCommodity(pageable);
    }

    @Override
    public void delete(Integer id) {
        commodityRepository.deleteCommodity(id);
    }
}
