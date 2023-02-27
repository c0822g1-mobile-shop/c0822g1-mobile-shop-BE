package com.codegym.service;

import com.codegym.model.supplier.Supplier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IFindSuppliersService {

    /**
     * Create by: TanTH,
     * Date created: 27/02/2023,
     * Function: show list supplier +Search supplier + create warehousing
     *
     * @param pageable
     * @return HttpStatus.OK
     */

    Page<List<Supplier>> showList(String name, Pageable pageable);
}
