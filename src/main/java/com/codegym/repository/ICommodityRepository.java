package com.codegym.repository;

import com.codegym.model.commodity.Commodity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface ICommodityRepository extends JpaRepository<Commodity,Integer> {
    @Query(value = "select * from `commodity` where name like concat('%',:name,'%')",nativeQuery = true)
    Page<Commodity> searchCommodity(@Param("name") String name, Pageable pageable);

    @Query(value = "select c.*, ifnull(ifnull(sum(wh.quantity),0)-ifnull(c.quantity,0),0)) as quantity_sold" +
            " from `commodity` c join ware_housing wh on c.id = wh.id_commodity" +
            "group by c.id order by quantity_sold asc limit 20 ", nativeQuery = true)
    Page<Commodity> getCommodityByQuantity(Pageable pageable);
}
