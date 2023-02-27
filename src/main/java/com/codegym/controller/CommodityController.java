package com.codegym.controller;

import com.codegym.model.commodity.Commodity;
import com.codegym.repository.ICommodityRepository;
import com.codegym.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
@CrossOrigin("*")
public class CommodityController {

    /**
     * Created by: CongBD,
     * Date Created: 27/02/2023
     * function: show commodity list
     *
     * @param pageable
     * @Return HttpStatus.NO_CONTENT if result is error or HttpStatus.OK if result is not error
     */

    @Autowired
    private ICommodityService commodityService;
    @GetMapping("/list")
    public ResponseEntity<Page<Commodity>> showList(Model model, @PageableDefault(value = 1) Pageable pageable){
        Page<Commodity> commodityList = commodityService.findAll(pageable);
        if (commodityList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(commodityList, HttpStatus.OK);
    }

    /**
     * Created by: CongBD,
     * Date Created: 27/02/2023
     * function: delete commodity
     *
     * @param id
     * @Return HttpStatus.OK if result is not error
     */


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Commodity> delete(@PathVariable("id") Integer id){
        commodityService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
