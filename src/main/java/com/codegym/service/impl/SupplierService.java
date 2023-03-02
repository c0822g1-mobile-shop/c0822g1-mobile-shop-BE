package com.codegym.service.impl;

import com.codegym.model.supplier.Supplier;
import com.codegym.repository.ISupplierRepository;
import com.codegym.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService implements ISupplierService {

    /**
     * Create by: DiemTTT,
     * Date created: 27/02/2023,
     * Function: show list supplier + delete supplier by id
     *
     * @param search
     * @param pageable
     * @return HttpStatus.NOT_FOUND if result is error or HttpStatus.OK if result is not error
     */

    @Autowired
    private ISupplierRepository iSupplierRepository;

    @Override
    public Page<Supplier> showList(String search, Pageable pageable) {
        return iSupplierRepository.showList(search, pageable);
    }

    @Override
    public void deleteSupplier(Integer id) {
        iSupplierRepository.deleteSupplier(id);
    }

}
