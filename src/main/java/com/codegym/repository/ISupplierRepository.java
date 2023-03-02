package com.codegym.repository;

import com.codegym.model.supplier.Supplier;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public interface ISupplierRepository extends JpaRepository<Supplier, Integer> {
    /**
     * Create by: DiemTTT,
     * Date created: 27/02/2023,
     * Function: show list supplier + delete supplier by id
     *
     * @param search
     * @param pageable
     * @return HttpStatus.NOT_FOUND if result is error or HttpStatus.OK if result is not error
     */

    @Query(value = "select * from supplier where (name like concat('%', :search , '%') or address like concat('%', :search , '%') or phone_number like concat('%', :search , '%')) and flag_delete=false",
            countQuery = "select count(*) from (select * from supplier where (name like concat('%', :search , '%') or address like concat('%', :search , '%') or phone_number like concat('%', :search , '%')) and flag_delete=false) as s",
            nativeQuery = true)
    Page<List<Supplier>> showList(@Param("search") String search, Pageable pageable);

    @Modifying
    @Transactional
    @Query(value = "update supplier set flag_delete = true where id = :id", nativeQuery = true)
    void deleteSupplier(@Param("id") Integer id);
    
    @Modifying
    @Transactional
    @Query(value = "insert into supplier(code, name, address, phone_number, email, flag_delete) value(:code, :name, :address, :phone, :email, false )", nativeQuery = true)
    void addSupplier(@Param("code") String code, @Param("name") String name, @Param("address") String address, @Param("phone") String phoneNumber, @Param("email") String email);

    @Query(value = "select * from supplier where id = :id and flag_delete = false", nativeQuery = true)
    Supplier findSupplier(@Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value = "update supplier set name = :name, address = :address, phone_number = :phone, email = :email where id = :id and flag_delete = false", nativeQuery = true)
    void updateSupplier(@Param("name") String name, @Param("address") String address, @Param("phone") String phoneNumber, @Param("email") String email, @Param("id") Integer id);

    @Query(value = "select * from supplier", nativeQuery = true)
    List<Supplier> supplierList();


    /**
     * Create by: TanTH,
     * Date created: 27/02/2023,
     * Function: show list supplier +Search supplier
     *
     * @param pageable
     */

    @Query(value = "select * from supplier where (name like concat('%', :name , '%') and address like concat('%', :address , '%') and email like concat('%', :email , '%')) and flag_delete=false", nativeQuery = true)
    Page<Supplier> showSupplierList(@Param("name") String name, @Param("address") String address , @Param("email") String email,  Pageable pageable);
}
