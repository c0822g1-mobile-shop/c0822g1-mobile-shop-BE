package com.codegym.service.impl;

import com.codegym.model.supplier.Supplier;
import com.codegym.repository.IFindSuppliersRepository;
import com.codegym.service.IFindSuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindSuppliersService implements IFindSuppliersService {

    /**
     * Create by: TanTH,
     * Date created: 27/02/2023,
     * Function: show list supplier +Search supplier + create warehousing
     *
     * @param search
     * @param pageable
     * @return HttpStatus.OK
     */

    @Autowired
    private IFindSuppliersRepository findSuppliersRepository;

    @Override
    public Page<List<Supplier>> showList(String name, Pageable pageable) {
        return findSuppliersRepository.showList(name,pageable);
    }


}
