package com.codegym.controller.commodityController;
import com.codegym.model.commodity.Commodity;
import com.codegym.service.IWareHousingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping("/api/wareHousing")
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


   @PutMapping("{id}&{quantityNew}")
    private ResponseEntity<?> wareHousing(@PathVariable("id") Integer id, @PathVariable( "quantityNew") Integer quantityNew) {
       wareHousingService.wareHousing(quantityNew, id);
       return  new ResponseEntity<>(HttpStatus.OK);
   }



}
