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
import java.util.Optional;

@Repository
public interface ICommodityRepository extends JpaRepository<Commodity,Integer> {

    /**
     * Created by: CongBD,
     * Date Created: 27/02/2023
     * function: show commodity list
     *
     * @param pageable
     * @Return HttpStatus.NO_CONTENT if result is error or HttpStatus.OK if result is not error
     */
    @Query(value = "select * from commodity where flag_delete = false " +
            "and (commodity.name like concat('%',:search ,'%')" +
            " or commodity.price = :search " +
            "or  commodity.quantity = :search)", nativeQuery = true)
    Page<Commodity> showListCommodity(@Param("search") String name,
                                      Pageable pageable);

    /**
     * Created by: CongBD,
     * Date Created: 27/02/2023
     * function: delete commodity
     *
     * @param id
     * @Return HttpStatus.OK if result is not error
     */
    @Modifying
    @Transactional
    @Query(value = "update commodity  set flag_delete = true" +
            " where id = :id", nativeQuery = true)
    void deleteCommodity(@Param("id") Integer id);

    @Query(value = "select * from commodity where id = :id and flag_delete = false",nativeQuery = true)
    Optional<Commodity> findById(@Param("id") int id);
}
