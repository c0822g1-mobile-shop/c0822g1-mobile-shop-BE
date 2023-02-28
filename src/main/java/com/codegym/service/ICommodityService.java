package com.codegym.service;

import com.codegym.model.commodity.Commodity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICommodityService {
    Page<Commodity> getCommodityByQuantity(Pageable pageable);
    Page<Commodity> searchCommodity(String name, Pageable pageable);
}
