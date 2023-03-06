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
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface ICommodityRepository extends JpaRepository<Commodity, Integer> {

    /** Created by: LongPT
     *
     */
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
            "quantity," +
            "flag_delete," +
            "interest_rate) " +
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
            ":#{#commodity.quantity}," +
            ":#{#commodity.flagDelete}," +
            ":#{#commodity.interestRate}" +
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


    /**
     * Created by: CongBD,
     * Date Created: 27/02/2023
     * function: show commodity list
     *
     * @param pageable
     */
    @Query(value = "select * from commodity where flag_delete = false ", nativeQuery = true)
    Page<Commodity> showListCommodity(Pageable pageable);

    /**
     * Created by: CongBD,
     * Date Created: 27/02/2023
     * function: search name commodity
     *
     * @param name
     */
    @Query(value = "select * from commodity where name like %:name% and flag_delete = false ", nativeQuery = true)
    Page<Commodity> searchByName(@Param("name") String name, Pageable pageable);

    /**
     * Created by: CongBD,
     * Date Created: 27/02/2023
     * function: search price commodity
     *
     * @param price
     */
    @Query(value = "select * from commodity where price = :price and flag_delete = false ", nativeQuery = true)
    Page<Commodity> searchByPrice(@Param("price") double price, Pageable pageable);

    /**
     * Created by: CongBD,
     * Date Created: 27/02/2023
     * function: search quantity commodity
     *
     * @param quantity
     */
    @Query(value = "select * from commodity where quantity = :quantity and flag_delete = false ", nativeQuery = true)
    Page<Commodity> searchByQuantity(@Param("quantity") int quantity, Pageable pageable);

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
     */
    @Modifying
    @Transactional
    @Query(value = "update commodity  set flag_delete = true" +
            " where id = :id", nativeQuery = true)
    void deleteCommodity(@Param("id") Integer id);

    @Query(value = "select * from commodity where id = :id and flag_delete = false", nativeQuery = true)
    Optional<Commodity> findById(@Param("id") int id);

    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get all commodity
     *
     * @param:name
     * @param:pageable
     **/
    @Query(value = "select * from commodity where commodity.name like concat('%', :name, '%')", nativeQuery = true)
    Page<Commodity> getAllCommodity(Pageable pageable, @Param("name") String name);

    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get all commodity
     *
     * @param: pageable
     */

    @Query(value = "select * from commodity", nativeQuery = true)
    Page<Commodity> getAllCommodityNoParam(Pageable pageable);

    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get commodity by id
     *
     * @param: id
     */

    @Query(value = "select * from commodity where commodity.id = :id"
            , nativeQuery = true)
    Optional<Commodity> findCommodityById(@Param("id") Integer id);

    /**
     * Created by: PhucNT
     * Date created: 27/2/2023
     * Function: searchCommodity
     *
     * @param: name
     */
    @Query(value = "select * from `commodity` where name like concat('%',:name,'%')", nativeQuery = true)
    Page<Commodity> searchCommodity(@Param("name") String name, Pageable pageable);


    /**
     * Created by: PhucNT
     * Date created: 27/2/2023
     * Function: get commodity list bt quantity sold
     */

    @Query(nativeQuery = true, value = "SELECT c.* , ifnull(sum(ifnull(wh.quantity,0))-ifnull(c.quantity,0),0) as quantity_sold" +
            " FROM `commodity` c JOIN `ware_housing` wh on c.id = wh.commodity_id GROUP BY c.id " +
            "ORDER BY quantity_sold")
    Page<Commodity> getCommodityByQuantity(Pageable pageable, @Param("limit") Integer limit);

    /**
     * Create by : DuongLTH
     * Date create 27/02/2023
     *
     * @param: QRCode
     */
    @Query(value = "SELECT * FROM commodity where code_qr=:QRCode", nativeQuery = true)
    Commodity findByQRCode(@Param("QRCode") String QRCode);


    @Query(value = "select * from commodity", nativeQuery = true)
    List<Commodity> getList();

}
