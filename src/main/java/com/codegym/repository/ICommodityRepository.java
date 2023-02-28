package com.codegym.repository;

<<<<<<< HEAD
public interface ICommodityRepository {
=======
import com.codegym.model.commodity.Commodity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface ICommodityRepository extends JpaRepository<Commodity, Integer> {
    @Query(value = "select * from `commodity` where name like concat('%',:name,'%')", nativeQuery = true)
    Page<Commodity> searchCommodity(@Param("name") String name, Pageable pageable);

    @Query(nativeQuery = true, value = "SELECT c.* , ifnull(sum(ifnull(wh.quantity,0))-ifnull(c.quantity,0),0) as quantity_sold" +
            " FROM `commodity` c JOIN `ware_housing` wh on c.id = wh.commodity_id GROUP BY c.id " +
            "ORDER BY quantity_sold")
    Page<Commodity> getCommodityByQuantity(Pageable pageable);
>>>>>>> home-PhucNT
}
