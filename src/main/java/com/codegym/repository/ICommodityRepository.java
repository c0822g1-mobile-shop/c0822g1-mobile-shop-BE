package com.codegym.repository;

import com.codegym.model.commodity.Commodity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICommodityRepository extends JpaRepository<Commodity,Integer> {
    /**
     * Create by : DuongLTH
     * Date create 27/02/2023
     * @param QRCode
     */
    @Query(value = "SELECT * FROM commodity where codeqr=:QRCode",nativeQuery = true)
    Commodity findByQRCode(@Param("QRCode") String QRCode);
}
