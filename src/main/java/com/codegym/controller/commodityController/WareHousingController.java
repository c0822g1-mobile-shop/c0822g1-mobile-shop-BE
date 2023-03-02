package com.codegym.controller.commodityController;
import com.codegym.model.commodity.Commodity;
import com.codegym.service.IWareHousingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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



   @PutMapping("/ware-housing")
    private ResponseEntity<?> wareHousing(@RequestBody Commodity commodity, @RequestParam(value = "quantityNew") Integer quantityNew){
       if (commodity==null && quantityNew == null){
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
       }
       wareHousingService.wareHousing(quantityNew, commodity.getId());
        return  new ResponseEntity<>(HttpStatus.OK);
    }


}
