package com.codegym.controller.commodityController;
import com.codegym.dto.CommodityDto;
import com.codegym.model.commodity.Commodity;
import com.codegym.service.ICommodityService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@CrossOrigin("*")
@RequestMapping("/api/commodity")
@RestController
public class CommodityController {
    @Autowired
    private ICommodityService commodityService;



    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get all commodity
     * @param pageable
     * @param name
     * @return HttpStatus.NOT_FOUND if result is error. HttpStatus.OK if result is not error.
     */
    @GetMapping("")
    public ResponseEntity<Page<Commodity>> getAllCommodity(@PageableDefault(size = 5) Pageable pageable, @RequestParam(required = false, defaultValue = "") String name) {
        Page<Commodity> commodityPage;
        if (name == null) {
            commodityPage = commodityService.getAllCommodityNoParam(pageable);
        } else {
            commodityPage = commodityService.getAllCommodity(pageable, name);
        }
        if (commodityPage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(commodityPage, HttpStatus.OK);
    }

    /**
     * Created by: CongBD,
     * Date Created: 27/02/2023
     * function: show commodity list
     *
     * @param pageable
     * @Return HttpStatus.NO_CONTENT if result is error or HttpStatus.OK if result is not error
     */
    @GetMapping("/list")
    public ResponseEntity<Page<Commodity>> showList(
            @PageableDefault(value = 5) Pageable pageable) {
        Page<Commodity> commodityList = commodityService.findAll(pageable);
        if (commodityList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
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
    public ResponseEntity<Commodity> delete(@PathVariable("id") Integer id) {
        Commodity commodity = commodityService.findCommodity(id);
        if (commodity == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        commodityService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * Created by: CongBD,
     * Date Created: 27/02/2023
     * function: search commodity
     *
     * @param id
     * @param type
     * @Return HttpStatus.OK if result is not error
     */
    @GetMapping("/search/{id}/{type}")
    public ResponseEntity<Page<Commodity>> search(@PathVariable("id") int id, @PathVariable("type") String type, @PageableDefault(value = 5) Pageable pageable) {
        switch (id) {
            case 0:
                return this.showList(pageable);
            case 1:
                return new ResponseEntity<>(commodityService.searchByName(type, pageable), HttpStatus.ACCEPTED);
            case 2:
                return new ResponseEntity<>(commodityService.searchByPrice(Double.parseDouble(type), pageable), HttpStatus.ACCEPTED);
            case 3:
                return new ResponseEntity<>(commodityService.searchByQuantity(Integer.parseInt(type), pageable), HttpStatus.ACCEPTED);
            default:
                return ResponseEntity.ok(null);
        }
    }

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
        Map<String, String> check = commodityService.checkCreate(commodityDto);
        if (check.get("errorName") != null) {
            bindingResult.rejectValue("name", "name", check.get("errorName"));
        }
        if (check.get("errorCode") != null) {
            bindingResult.rejectValue("codeQr", "codeQr", check.get("errorCode"));
        }
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(bindingResult.getAllErrors(), HttpStatus.NOT_MODIFIED);
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

    @GetMapping("/{id}")
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
    @PutMapping("/edit/{id}")
    public ResponseEntity<?> editCommodity(@RequestBody @Validated CommodityDto commodityDto, BindingResult bindingResult, @PathVariable("id") Integer id) {
        Commodity commodity = commodityService.findCommodity(id);
        Map<String, String> check = commodityService.checkUpdate(commodityDto);
        if (check.get("errorName") != null) {
            bindingResult.rejectValue("name", "name", check.get("errorName"));
        }
        if (check.get("errorCode") != null) {
            bindingResult.rejectValue("code", "code", check.get("errorCode"));
        }
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(bindingResult.getAllErrors(), HttpStatus.NOT_MODIFIED);
        }
        if (commodity == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        BeanUtils.copyProperties(commodityDto, commodity);
        commodityService.editCommodity(commodity);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getList")
    public ResponseEntity<List<Commodity>> getList() {
        return new ResponseEntity<>(commodityService.getList(), HttpStatus.OK);
    }
}

