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
    @Query(value = "select * from `commodity` from where name like %:name%",nativeQuery = true)
    Page<Commodity> searchCommodity(@Param("name") String name, Pageable pageable);

    @Query(value = "select c.*,ifnull(ifnull(sum(ich.quantity),0)-ifnull(c.quantity,0),0)) as quantity_sold" +
            " from `commodity` c join import_commodity_history ich on c.id = ich.id_commodity" +
            "group by c.id order by quantity_sold asc limit 20 ", nativeQuery = true)
    Page<Commodity> getCommodityByQuantity(Pageable pageable);
}
