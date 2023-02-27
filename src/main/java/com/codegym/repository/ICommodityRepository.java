package com.codegym.repository;

import com.codegym.model.commodity.Commodity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ICommodityRepository extends JpaRepository<Commodity,Integer> {
    @Query(value = "select * from commodity where flag_delete = false", nativeQuery = true)
    Page<Commodity> showListCommodity(Pageable pageable);


    @Modifying
    @Transactional
    @Query(value = "update commodity  set flag_delete = true" +
            " where id = :id", nativeQuery = true)
    void deleteCommodity(@Param("id") Integer id);
}
