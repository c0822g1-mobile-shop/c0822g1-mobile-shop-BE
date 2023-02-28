package com.codegym.repository;

import com.codegym.model.bill.Bill;
import com.codegym.model.commodity.Commodity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface ICommodityRepository extends JpaRepository<Commodity, Integer> {

//    @Transactional
//    @Modifying
//    @Query(value = " insert into commodity (`name`, " +
//            " cpu, " +
//            " capacity, " +
//            " tradeMark, " +
//            " price, " +
//            " image, " +
//            " camera, " +
//            " selfie, " +
//            " screenSize, " +
//            " guarantee, " +
//            " origin, " +
//            " description, " +
//            " codeQR, " +
//            " quantity)",nativeQuery = true)
//    void saveCommodity(@Param("commodity") Commodity commodity);
}
