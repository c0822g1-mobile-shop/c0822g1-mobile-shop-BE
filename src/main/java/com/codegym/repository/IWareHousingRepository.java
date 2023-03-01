package com.codegym.repository;
import com.codegym.model.commodity.WareHousing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface IWareHousingRepository extends JpaRepository<WareHousing, Integer> {

    /**
     * Create by: TanTH
     * Date created: 27/02/2023,
     * Function: show list supplier +Search supplier + create warehousing
     */
      @Transactional
    @Modifying
   @Query(value = "update commodity as c set c.quantity = (c.quantity + :quantityNew) where id = :id", nativeQuery = true)
    void wareHousing(@Param("quantityNew") Integer quantityNew, @Param("id") Integer id);


}