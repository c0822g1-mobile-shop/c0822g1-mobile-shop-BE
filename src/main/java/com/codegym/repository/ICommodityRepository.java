package com.codegym.repository;

import com.codegym.model.commodity.Commodity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface ICommodityRepository extends JpaRepository<Commodity, Integer> {

    /**
     * Created by: DanhHD
     * Date Created: 27/02/2023
     * Function: create commodity
     *
     * @param commodity
     * @return HttpStatus.BAD_REQUEST if result is error or HttpStatus.OK if result is not error
     */

    @Modifying
    @Transactional
    @Query(value = "insert into commodity" +
            "(`name`, " +
            "cpu, " +
            "capacity, " +
            "trademark_id, " +
            "price," +
            "image, " +
            "camera, " +
            "selfie, " +
            "screen_size, " +
            "guarantee, " +
            "origin, " +
            "description, " +
            "code_qr," +
            "quantity, " +
            "flag_delete) " +
            "values " +
            "(:#{#commodity.name}, " +
            ":#{#commodity.cpu}, " +
            ":#{#commodity.capacity}, " +
            ":#{#commodity.trademark.id}, " +
            ":#{#commodity.price}, " +
            ":#{#commodity.image}, " +
            ":#{#commodity.camera}, " +
            ":#{#commodity.selfie}, " +
            ":#{#commodity.screenSize}, " +
            ":#{#commodity.guarantee}," +
            ":#{#commodity.origin}, " +
            ":#{#commodity.description}, " +
            ":#{#commodity.codeQr}, " +
            ":#{#commodity.quantity}, false )",
            nativeQuery = true)
    void addCommodity(@Param("commodity") Commodity commodity);

    /**
     * Created by: DanhHD
     * Date Created: 27/02/2023
     * Function: find commodity by id
     *
     * @param id
     * @return HttpStatus.OK if id is found
     */

    @Query(value = "select * from commodity " +
            "where id =:id " +
            "and flag_delete = false",
            nativeQuery = true)
    Commodity findCommodity(@Param("id") Integer id);

    /**
     * Created by: DanhHD
     * Date Created: 27/02/2023
     * Function: edit commodity by id
     *
     * @param commodity
     * @return HttpStatus.BAD_REQUEST if result is error or HttpStatus.OK if result is not error
     */

    @Modifying
    @Transactional
    @Query(value = "update commodity set " +
            "`name` =:#{#commodity.name}, " +
            "cpu =:#{#commodity.cpu}, " +
            "capacity =:#{#commodity.capacity}, " +
            "trademark_id =:#{#commodity.trademark.id}, " +
            "price =:#{#commodity.price}," +
            "image =:#{#commodity.image}, " +
            "camera =:#{#commodity.camera}, " +
            "selfie =:#{#commodity.selfie}, " +
            "screen_size =:#{#commodity.screenSize}, " +
            "guarantee =:#{#commodity.guarantee}, " +
            "origin =:#{#commodity.origin}," +
            "description =:#{#commodity.description}, " +
            "code_qr =:#{#commodity.codeQr}, " +
            "quantity =:#{#commodity.quantity} " +
            "where id =:#{#commodity.id} " +
            "and flag_delete = false ",
            nativeQuery = true)
    void editCommodity(@Param("commodity") Commodity commodity);
}
