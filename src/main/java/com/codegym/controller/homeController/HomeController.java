package com.codegym.controller.homeController;

import com.codegym.model.commodity.Commodity;
import com.codegym.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private ICommodityService commodityService;

    /**
     * Create by: PhucNT
     * Date create: 27/02/2023
     * Function: list Commodity search & List Commodity order by quantity sold
     *
     * @return HttpStatus.OK if result not error
     * @return HttpStatus.badRequest if result not found
     * @return List Commodity order by quantity sold
     * @Param name
     */
    @GetMapping("search")
    public ResponseEntity<?> searchCommodity(@RequestParam(name = "name", defaultValue = "", required = false) String name, @PageableDefault(size = 5) Pageable pageable) {
        if (name.equals("null")) {
            name = "";
        }
        Page<Commodity> commodityPage = commodityService.getAllCommodity(pageable, name);
        if (commodityPage.getTotalElements() == 0) {
            return new ResponseEntity<>(name, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(commodityPage, HttpStatus.OK);
    }

    @GetMapping("quantity")
    public ResponseEntity<Page<Commodity>> pageResponseEntityByQuantity(@PageableDefault(value = 5) Pageable pageable) {
        Page<Commodity> commodityPage = commodityService.getCommodityByQuantity(pageable);
        return new ResponseEntity<>(commodityPage, HttpStatus.OK);
    }
}
