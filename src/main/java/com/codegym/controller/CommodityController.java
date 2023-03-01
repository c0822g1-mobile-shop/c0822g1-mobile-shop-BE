package com.codegym.controller;

import com.codegym.dto.CommodityDto;
import com.codegym.model.commodity.Commodity;
import com.codegym.service.ICommodityService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/commodity")
public class CommodityController {
    @Autowired
    private ICommodityService commodityService;


    /**
     * Created by: DanhHD
     * Date Created: 27/02/2023
     * Function: create commodity
     *
     * @param commodityDto
     * @param bindingResult
     * @return HttpStatus.BAD_REQUEST if result is error or HttpStatus.OK if result is not error
     */

    @PostMapping("/create")
    public ResponseEntity<?> createCommodity(@RequestBody @Validated CommodityDto commodityDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(bindingResult.getAllErrors(), HttpStatus.BAD_REQUEST);
        }
        Commodity commodity = new Commodity();
        BeanUtils.copyProperties(commodityDto, commodity);
        commodityService.addCommodity(commodity);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Created by: DanhHD
     * Date Created: 27/02/2023
     * Function: find commodity by id
     *
     * @param id
     * @return HttpStatus.BAD_REQUEST if id is not found or HttpStatus.OK if id is found
     */

    @GetMapping("{id}")
    public ResponseEntity<Commodity> findById(@PathVariable("id") Integer id) {
        Commodity commodity = commodityService.findCommodity(id);
        if (commodity == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(commodity, HttpStatus.OK);
    }

    /**
     * Created by: DanhHD
     * Date Created: 27/02/2023
     * Function: edit commodity by id
     *
     * @param commodityDto
     * @param bindingResult
     * @return HttpStatus.BAD_REQUEST if result is error or HttpStatus.OK if result is not error
     */

    @PutMapping("/edit")
    public ResponseEntity<?> editCommodity(@RequestBody @Validated CommodityDto commodityDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(bindingResult.getAllErrors(), HttpStatus.BAD_REQUEST);
        }
        Commodity commodity = new Commodity();
        BeanUtils.copyProperties(commodityDto, commodity);
        commodityService.editCommodity(commodity);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
