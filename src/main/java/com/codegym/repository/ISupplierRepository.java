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
    Page<Supplier> showList(@Param("search") String search, Pageable pageable);

    @Modifying
    @Transactional
    @Query(value = "update supplier set flag_delete = true where id = :id", nativeQuery = true)
    void deleteSupplier(@Param("id") Integer id);

}
