package com.codegym.controller.commodityController;
import com.codegym.model.commodity.Commodity;
import com.codegym.model.supplier.Supplier;
import com.codegym.service.IFindSuppliersService;
import com.codegym.service.IWareHousingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
@CrossOrigin("*")
public class WareHousingController {

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
    private IWareHousingService wareHousingService;

    @Autowired
    private IFindSuppliersService findSuppliersService;


   @PutMapping("/ware-housing")
    private ResponseEntity<?> wareHousing(@RequestBody Commodity commodity, @RequestParam(value = "quantityNew") Integer quantityNew){
       if (commodity==null && quantityNew == null){
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
       }
       wareHousingService.wareHousing(quantityNew, commodity.getId());
        return  new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping("/list")
    private ResponseEntity<?> showLists(@RequestParam(value = "search", defaultValue = "") String search, @PageableDefault(value = 2)Pageable pageable) {
        Page<List<Supplier>> lists = findSuppliersService.showList(search,pageable);
        return new ResponseEntity<>(lists, HttpStatus.OK);
    }



}
