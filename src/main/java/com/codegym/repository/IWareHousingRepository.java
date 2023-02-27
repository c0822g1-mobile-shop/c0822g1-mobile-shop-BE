package com.codegym.repository;

import com.codegym.model.commodity.WareHousing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IWareHousingRepository extends JpaRepository<WareHousing, Integer> {

    /**
     * Create by: TanTH,
     * Date created: 27/02/2023,
     * Function: show list supplier +Search supplier + create warehousing
     */
    @Query(value = "update commodity set quantity = :quantity where id = :id", nativeQuery = true)
    void wareHousing(@Param("quantity") Integer quantity, @Param("id") Integer id);
}