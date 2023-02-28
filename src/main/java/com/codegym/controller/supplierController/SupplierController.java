package com.codegym.controller.supplierController;

import com.codegym.model.supplier.Supplier;
import com.codegym.service.impl.SupplierService;
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
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    /**
     * Create by: DiemTTT,
     * Date created: 27/02/2023,
     * Function: show list supplier + delete supplier by id
     *
     * @param search
     * @param pageable
     * @return HttpStatus.NOT_FOUND if result is error or HttpStatus.OK if result is not error
     */
    @GetMapping("/list")
    private ResponseEntity<?> showList(@RequestParam(defaultValue = "", required = false) String search,
                                       @PageableDefault(size = 3) Pageable pageable) {
        System.out.println(search);
        Page<List<Supplier>> supplierListDtoList = supplierService.showList(search, pageable);
        return new ResponseEntity<>(supplierListDtoList, HttpStatus.OK);
    }

    @PatchMapping("/list")
    private ResponseEntity<?> delete(@RequestBody Supplier supplier) {
        try {
            supplierService.deleteSupplier(supplier.getId());
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
