package com.codegym.service;

import com.codegym.model.commodity.Commodity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

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


    /**
     * Created by: CongBD,
     * Date Created: 27/02/2023
     * function: show commodity list
     *
     * @param pageable
     * @Return HttpStatus.NO_CONTENT if result is error or HttpStatus.OK if result is not error
     */
    Page<Commodity> findAll(String search, Pageable pageable);


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

    Page<Commodity> getAllCommodity(Pageable pageable, String name);

    Page<Commodity> getAllCommodityNoParam(Pageable pageable);

    Optional<Commodity> findCommodityById(Integer id);

    Page<Commodity> getCommodityByQuantity(Pageable pageable);

    Page<Commodity> searchCommodity(String name, Pageable pageable);


    /**
     * Create by : DuongLTH
     * Date create 27/02/2023
     *
     * @param QRCode
     */
    Commodity findByQRCode(@Param("QRCode") String QRCode);

}
