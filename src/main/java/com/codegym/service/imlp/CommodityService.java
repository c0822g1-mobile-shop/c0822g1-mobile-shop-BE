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

    public Page<Commodity> searchCommodity(String name, Pageable pageable){
        return commodityRepository.searchCommodity(name,pageable);
    }

    public Page<Commodity> getCommodityByQuantity(Pageable pageable){
        return commodityRepository.getCommodityByQuantity(pageable, 20);
    }
}
