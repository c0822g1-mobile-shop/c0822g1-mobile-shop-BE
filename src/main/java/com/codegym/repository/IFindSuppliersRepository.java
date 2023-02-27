package com.codegym.repository;

import com.codegym.model.supplier.Supplier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFindSuppliersRepository extends JpaRepository<Supplier , Integer> {

    /**
     * Create by: TanTH,
     * Date created: 27/02/2023,
     * Function: show list supplier +Search supplier + create warehousing
     *
     * @param search
     * @param pageable
     */

    @Query(value = "select * from Supplier where (name like concat('%', :search , '%')", nativeQuery = true)
    Page<List<Supplier>> showList(@Param("search") String search, Pageable pageable);

}