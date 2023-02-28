package com.codegym.service.impl;

import com.codegym.repository.IWareHousingRepository;
import com.codegym.service.IWareHousingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WareHousingService implements IWareHousingService {


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
    private IWareHousingRepository wareHousingRepository;


    @Override
    public void wareHousing(Integer quantityNew, Integer id) {
        wareHousingRepository.wareHousing(quantityNew,id);
    }
}
