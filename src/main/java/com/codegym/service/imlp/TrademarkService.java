package com.codegym.service.imlp;

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

    @Override
    public List<Trademark> getAllTrademark() {
        return trademarkRepository.getAllTrademark();
    }
}
