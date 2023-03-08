package com.codegym.service;

<<<<<<< HEAD
=======
import com.codegym.model.SalesReport.ISalesReport;
import com.codegym.dto.CommodityDto;
>>>>>>> origin/develop
import com.codegym.model.commodity.Commodity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
<<<<<<< HEAD


import java.util.Optional;
=======


import java.util.List;

import java.util.Map;

>>>>>>> origin/develop

public interface ICommodityService {

    /**
     * Created by: DanhHD
     * Date Created: 27/02/2023
     * Function: create commodity
     *
     * @param commodity
     * @return HttpStatus.BAD_REQUEST if result is error or HttpStatus.OK if result is not error
     */
    void addCommodity(Commodity commodity);

    /**
     * Created by: DanhHD
     * Date Created: 27/02/2023
     * Function: find commodity by id
     *
     * @param id
     * @return HttpStatus.OK if id is found
     */
    Commodity findCommodity(Integer id);

    /**
     * Created by: DanhHD
     * Date Created: 27/02/2023
     * Function: edit commodity by id
     *
     * @param commodity
     * @return HttpStatus.BAD_REQUEST if result is error or HttpStatus.OK if result is not error
     */

    void editCommodity(Commodity commodity);

<<<<<<< HEAD
=======

>>>>>>> origin/develop
    /**
     * Created by: CongBD,
     * Date Created: 27/02/2023
     * function: show commodity list
     *
     * @param pageable
     * @Return HttpStatus.NO_CONTENT if result is error or HttpStatus.OK if result is not error
     */
    Page<Commodity> findAll(Pageable pageable);

    /**
     * Created by: CongBD,
     * Date Created: 27/02/2023
     * function: delete commodity
     *
     * @param id
     * @Return HttpStatus.OK if result is not error
     */
    void delete(Integer id);

    /**
     * Created by: CongBD,
     * Date Created: 27/02/2023
     * function: search quantity commodity
     *
     * @param quantity
     * @Return HttpStatus.OK if result is not error
     */
    Page<Commodity> searchByQuantity(int quantity, Pageable pageable);

    /**
     * Created by: CongBD,
     * Date Created: 27/02/2023
     * function: search price commodity
     *
     * @param price
     * @Return HttpStatus.OK if result is not error
     */
    Page<Commodity> searchByPrice(double price, Pageable pageable);

    /**
     * Created by: CongBD,
     * Date Created: 27/02/2023
     * function: search name commodity
     *
     * @param name
     * @Return HttpStatus.OK if result is not error
     */
<<<<<<< HEAD
    Page<Commodity> searchByName( String name,Pageable pageable);




    Optional<Commodity> findById(int id);

    Page<Commodity> getAllCommodity(Pageable pageable, String name);
    
    Page<Commodity> getAllCommodityNoParam(Pageable pageable);
    
    Optional<Commodity> findCommodityById(Integer id);
    
    Page<Commodity> getCommodityByQuantity(Pageable pageable);

    /**
     * Create by : DuongLTH
     * Date create 27/02/2023
=======
    Page<Commodity> searchByName(String name, Pageable pageable);

    Page<Commodity> getAllCommodity(Pageable pageable, String name);

    Page<Commodity> getAllCommodityNoParam(Pageable pageable);

    Page<Commodity> getCommodityByQuantity(Pageable pageable);


    List<Commodity> getList();

    /**
     * Create by : DuongLTH
     * Date create 27/02/2023
     *
>>>>>>> origin/develop
     * @param: qrCode
     */
    Commodity findByQRCode(String QRCode);

<<<<<<< HEAD
=======
    Map<String, String> checkCreate(CommodityDto commodityDto);

    Map<String, String> checkUpdate(CommodityDto commodityDto);
>>>>>>> origin/develop
}
