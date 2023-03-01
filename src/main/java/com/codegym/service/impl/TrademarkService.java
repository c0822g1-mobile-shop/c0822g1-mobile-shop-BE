package com.codegym.service.impl;

import com.codegym.model.commodity.Trademark;
import com.codegym.repository.ITrademarkRepository;
import com.codegym.service.ITrademarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrademarkService implements ITrademarkService {
    @Autowired
    private ITrademarkRepository trademarkRepository;

    /**
     * Created by: DanhHD
     * Date Created: 01/03/2023
     * Function: show trademark list
     */
    @Override
    public List<Trademark> getAllTrademark() {
        return trademarkRepository.getAllTrademark();
    }
}
