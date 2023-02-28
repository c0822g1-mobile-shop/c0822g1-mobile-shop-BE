package com.codegym.controller.commodityController;

import com.codegym.model.commodity.Commodity;
import com.codegym.model.user.User;
import com.codegym.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/commodity")
public class CommodityController {
    @Autowired
    private ICommodityService commodityService;
    @GetMapping("")
    public ResponseEntity<Page<Commodity>> getAllCommodity(@PageableDefault(size = 5) Pageable pageable, @RequestParam(required = false, defaultValue = "") String name) {
        Page<Commodity> commodityPage;
        if (name == null ) {
            commodityPage = commodityService.getAllCommodityNoParam(pageable);
        } else {
            commodityPage = commodityService.getAllCommodity(pageable, name);
        }
        if (commodityPage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(commodityPage, HttpStatus.OK);
    }
    @GetMapping("{id}")
    public ResponseEntity<Optional<Commodity>> getCommodityById(@PathVariable("id") Integer id) {
        Optional<Commodity> commodity;
        if (id == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            commodity = commodityService.findCommodityById(id);
            return new ResponseEntity<>(commodity, HttpStatus.OK);
        }
    }

}
