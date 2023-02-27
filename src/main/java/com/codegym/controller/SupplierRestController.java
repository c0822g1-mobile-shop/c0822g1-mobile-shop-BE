package com.codegym.controller;

import com.codegym.dto.SupplierDto;
import com.codegym.model.supplier.Supplier;
import com.codegym.service.ISupplierService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("")
@CrossOrigin("*")
public class SupplierRestController {

    @Autowired
    private ISupplierService supplierService;

    /**
     * Created By: CongTT
     * Date created: 27/02/2023
     * Function: create supplier
     * Param: supplierDto
     * Return: HttpStatus.BAD_REQUEST if result is error or HttpStatus.CREATED if result is not error.
     */

    @PostMapping("/add")
    private ResponseEntity<?> addSupplier(@RequestBody @Validated SupplierDto supplierDto, BindingResult bindingResult) {
        new SupplierDto().validate(supplierDto, bindingResult);
        Map<String, String> check = supplierService.checkCreate(supplierDto);

        if (check.get("errorCode") != null) {
            bindingResult.rejectValue("code", "code", check.get("errorCode"));
        }

        if (check.get("errorPhone") != null) {
            bindingResult.rejectValue("phoneNumber", "phoneNumber", check.get("errorPhone"));
        }

        if (check.get("errorEmail") != null) {
            bindingResult.rejectValue("email", "email", check.get("errorEmail"));
        }

        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(bindingResult.getAllErrors(), HttpStatus.BAD_REQUEST);
        }
        Supplier supplier = new Supplier();
        BeanUtils.copyProperties(supplierDto, supplier);
        supplierService.addSupplier(supplier.getCode(), supplier.getName(), supplier.getAddress(), supplier.getPhoneNumber(), supplier.getEmail());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    /**
     * Created By: CongTT
     * Date created: 27/02/2023
     * Function: find supplier by id
     * Param: id
     * Return: HttpStatus.OK if result is not error.
     */

    @GetMapping("/supplier/{id}")
    private ResponseEntity<Supplier> findSupplier(@PathVariable("id") Integer id) {
        Supplier supplier = supplierService.findSupplier(id);
        return new ResponseEntity<>(supplier, HttpStatus.OK);
    }


    /**
     * Created By: CongTT
     * Date created: 27/02/2023
     * Function: update supplier
     * Param: supplierDto
     * Return: HttpStatus.BAD_REQUEST if result is error or HttpStatus.OK if result is not error.
     */

    @PutMapping("/update")
    private ResponseEntity<?> updateSupplier(@RequestBody @Validated SupplierDto supplierDto, BindingResult bindingResult) {
        new SupplierDto().validate(supplierDto, bindingResult);
        Map<String, String> check = supplierService.checkUpdate(supplierDto);

        if (check.get("errorPhone") != null) {
            bindingResult.rejectValue("phoneNumber", "phoneNumber", check.get("errorPhone"));
        }

        if (check.get("errorEmail") != null) {
            bindingResult.rejectValue("email", "email", check.get("errorEmail"));
        }

        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(bindingResult.getAllErrors(), HttpStatus.BAD_REQUEST);
        }
        Supplier supplier = new Supplier();
        BeanUtils.copyProperties(supplierDto, supplier);
        supplierService.updateSupplier(supplier.getName(), supplier.getAddress(), supplier.getPhoneNumber(), supplier.getEmail(), supplier.getId());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
