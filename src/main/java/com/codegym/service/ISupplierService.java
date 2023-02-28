package com.codegym.service;

import com.codegym.model.supplier.Supplier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ISupplierService {

    /**
     * Create by: DiemTTT,
     * Date created: 27/02/2023,
     * Function: show list supplier + delete supplier by id
     *
     * @param search
     * @param pageable
     * @return HttpStatus.NOT_FOUND if result is error or HttpStatus.OK if result is not error
     */


    Page<List<Supplier>> showList(String search, Pageable pageable);

    void deleteSupplier(Integer id);
}
