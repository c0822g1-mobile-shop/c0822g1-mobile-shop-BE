package com.codegym.service;

import com.codegym.model.commodity.Commodity;
<<<<<<< HEAD
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
=======
import org.springframework.data.repository.query.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
>>>>>>> origin/develop

import java.util.Optional;

public interface ICommodityService {
<<<<<<< HEAD
    /**
     * Created by: CongBD,
     * Date Created: 27/02/2023
     * function: show commodity list
     *
     * @param pageable
     * @Return HttpStatus.NO_CONTENT if result is error or HttpStatus.OK if result is not error
     */
    Page<Commodity> findAll(String search,Pageable pageable);


    /**
     * Created by: CongBD,
     * Date Created: 27/02/2023
     * function: delete commodity
     *
     * @param id
     * @Return HttpStatus.OK if result is not error
     */
    void delete(Integer id);

    Optional<Commodity> findById(int id);
=======
    Page<Commodity> getAllCommodity(Pageable pageable, String name);
    
    Page<Commodity> getAllCommodityNoParam(Pageable pageable);
    
    Optional<Commodity> findCommodityById(Integer id);
    
    Page<Commodity> getCommodityByQuantity(Pageable pageable);
    
    Page<Commodity> searchCommodity(String name, Pageable pageable);
    
    
    /**
     * Create by : DuongLTH
     * Date create 27/02/2023
     * @param QRCode
     */
    Commodity findByQRCode(@Param("QRCode") String QRCode);
    
>>>>>>> origin/develop
}
