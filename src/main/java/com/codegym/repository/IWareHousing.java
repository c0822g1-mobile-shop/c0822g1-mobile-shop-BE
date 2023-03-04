package com.codegym.repository;

import com.codegym.model.commodity.WareHousing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface IWareHousing extends JpaRepository<WareHousing,Integer> {

    @Transactional
    @Modifying
    @Query(value = "insert into ware_housing (date_import, quantity, commodity_id, supplier_id) values (:date,:quantity,:commodity_id,:supplier_id)",nativeQuery = true)
    void enterStock(@Param("date") String date,@Param("quantity") String quantity,@Param("commodity_id") int commodityID,@Param("supplier_id") String supplierID);
}
