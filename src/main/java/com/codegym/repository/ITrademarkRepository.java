package com.codegym.repository;

import com.codegym.model.commodity.Trademark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ITrademarkRepository extends JpaRepository<Trademark, Integer> {

    /**
     * Created by: DanhHD
     * Date Created: 01/03/2023
     * Function: show trademark list
     */
    @Query(value = "select * from trademark", nativeQuery = true)
    List<Trademark> getAllTrademark();
}
