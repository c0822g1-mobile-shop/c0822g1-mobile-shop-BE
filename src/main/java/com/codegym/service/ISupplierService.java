package com.codegym.service;


import com.codegym.dto.SupplierDto;
import com.codegym.model.supplier.Supplier;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

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



    Page<Supplier> showList(String search, Pageable pageable);

    void deleteSupplier(Integer id);


    /**
     * Create by: CongTT,
     * Date created: 27/02/2023,
     * Function: add supplier + find supplier by id + update supplier
     */

    void addSupplier(String code, String name, String address, String phoneNumber, String email);

    Supplier findSupplier(Integer id);

    void updateSupplier(String name, String address, String phoneNumber, String email, Integer id);

    Map<String, String> checkCreate(SupplierDto supplierDto);

    Map<String, String> checkUpdate(SupplierDto supplierDto);

    /**
     * Create by: TanTH,
     * Date created: 27/02/2023,
     * Function: show list supplier +Search supplier
     *
     * @param pageable
     * @return HttpStatus.OK
     */


    Page<Supplier> showSupplierList(String name, String address , String email, Pageable pageable);
}
