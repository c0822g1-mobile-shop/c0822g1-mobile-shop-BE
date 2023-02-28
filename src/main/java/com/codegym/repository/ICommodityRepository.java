package com.codegym.repository;

import com.codegym.model.commodity.Commodity;
import com.codegym.model.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ICommodityRepository extends JpaRepository<Commodity, Integer> {
    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get all commodity
     * @param name
     * @param pageable
     */
    @Query(value = "select * from commodity where commodity.name like concat('%', :name, '%')", nativeQuery = true)
    Page<Commodity> getAllCommodity(Pageable pageable, @Param("name") String name);

    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get all commodity
     * @param pageable
     */
    @Query(value = "select * from commodity", nativeQuery = true)
    Page<Commodity> getAllCommodityNoParam(Pageable pageable);

    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get commodity by id
     * @param id
     */
    @Query(value = "select * from commodity where commodity.id = :id"
            ,nativeQuery = true)
    Optional<Commodity> findCommodityById(@Param("id") Integer id);
}

