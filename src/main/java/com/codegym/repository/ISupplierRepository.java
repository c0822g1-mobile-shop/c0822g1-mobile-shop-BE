package com.codegym.repository;

import com.codegym.model.supplier.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ISupplierRepository extends JpaRepository<Supplier, Integer> {

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
}
