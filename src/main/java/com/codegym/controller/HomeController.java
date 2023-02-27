package com.codegym.controller;

import com.codegym.model.commodity.Commodity;
import com.codegym.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("home")
public class HomeController {
    /**
     *Create by: PhucNT
     * Date create: 27/02/2023
     * Function: list Commodity search & List Commodity order by quantity sold
     *
     * @Param name
     * @return HttpStatus.OK if result not error
     */

    @Autowired
    private ICommodityService commodityService;
    @GetMapping("search/{name}")
    public ResponseEntity<Page<Commodity>> searchCommodity(@PathVariable(name = "name") String name, Pageable pageable){
        Page<Commodity> commodityPage = commodityService.searchCommodity(name,pageable);
        return new ResponseEntity<>(commodityPage,HttpStatus.OK) ;
    }
    @GetMapping("quantity")
    public ResponseEntity<Page<Commodity>> pageResponseEntityByQuantity(Pageable pageable){
        Page<Commodity> commodityPage = commodityService.getCommodityByQuantity(pageable);
        return new ResponseEntity<>(commodityPage,HttpStatus.OK);
    }
}
