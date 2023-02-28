package com.codegym.service;

import com.codegym.model.commodity.Commodity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ICommodityService {
    Page<Commodity> getAllCommodity(Pageable pageable, @Param("name") String name);
    Page<Commodity> getAllCommodityNoParam(Pageable pageable);
    Optional<Commodity> findCommodityById(@Param("id") Integer id);
}
