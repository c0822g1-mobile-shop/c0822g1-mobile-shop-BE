package com.codegym.repository;

import com.codegym.model.commodity.Commodity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import org.springframework.stereotype.Repository;

import java.util.Optional;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface ICommodityRepository extends JpaRepository<Commodity, Integer> {
    
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get all commodity
     * @param name
     * @param pageable
     */
    @Query(value = "select * from commodity where commodity.name like concat('%', :name, '%')", nativeQuery = true)
    Page<Commodity> getAllCommodity(Pageable pageable, @Param("name") String name);

    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get all commodity
     * @param pageable
     */
    @Query(value = "select * from commodity", nativeQuery = true)
    Page<Commodity> getAllCommodityNoParam(Pageable pageable);

    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get commodity by id
     * @param id
     */
    @Query(value = "select * from commodity where commodity.id = :id"
            ,nativeQuery = true)
    Optional<Commodity> findCommodityById(@Param("id") Integer id);
    
    /**
     * Created by: PhucNT
     * Date created: 27/2/2023
     * Function: searchCommodity
     * @param: name
     */
    @Query(value = "select * from `commodity` where name like concat('%',:name,'%')", nativeQuery = true)
    Page<Commodity> searchCommodity(@Param("name") String name, Pageable pageable);

    /**
     * Created by: PhucNT
     * Date created: 27/2/2023
     * Function: get conmmodity list bt quantity sold
     * @param:
     */
    @Query(nativeQuery = true, value = "SELECT c.* , ifnull(sum(ifnull(wh.quantity,0))-ifnull(c.quantity,0),0) as quantity_sold" +
            " FROM `commodity` c JOIN `ware_housing` wh on c.id = wh.commodity_id GROUP BY c.id " +
            "ORDER BY quantity_sold")
    Page<Commodity> getCommodityByQuantity(Pageable pageable, @Param("limit") Integer limit );
    
    /**
     * Create by : DuongLTH
     * Date create 27/02/2023
     * @param QRCode
     */
    @Query(value = "SELECT * FROM commodity where codeqr=:QRCode",nativeQuery = true)
    Commodity findByQRCode(@Param("QRCode") String QRCode);
}
