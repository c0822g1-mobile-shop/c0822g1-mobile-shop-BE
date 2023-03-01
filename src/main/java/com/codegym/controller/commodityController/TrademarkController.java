package com.codegym.controller.commodityController;

import com.codegym.model.commodity.Trademark;
import com.codegym.service.ITrademarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/trademark")
public class TrademarkController {
    @Autowired
    private ITrademarkService trademarkService;

    /**
     * Created by: DanhHD
     * Date Created: 01/03/2023
     * Function: show trademark list
     *
     * @return HttpStatus.NO_CONTENT if list is empty or HttpStatus.OK if list is not empty
     */

    @GetMapping("")
    public ResponseEntity<List<Trademark>> getAllTrademark() {
        List<Trademark> trademarks = trademarkService.getAllTrademark();
        if (trademarks.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(trademarks, HttpStatus.OK);
    }
}
