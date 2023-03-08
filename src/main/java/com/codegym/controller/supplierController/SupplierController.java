package com.codegym.controller.supplierController;

import com.codegym.dto.SupplierDto;
import com.codegym.model.supplier.Supplier;
import com.codegym.service.impl.SupplierService;
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

@RestController
@RequestMapping("/supplier")
@CrossOrigin("*")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    /**
     * Create by: DiemTTT,
     * Date created: 27/02/2023,
     * Function: show list supplier + delete supplier by id
     * @param:search
     * @param:pageable
     * @return HttpStatus.NOT_FOUND if result is error or HttpStatus.OK if result is not error
     */
    @GetMapping("/list")
    private ResponseEntity<?> showList(@RequestParam(defaultValue = "", required = false) String search,
                                       @PageableDefault(size = 5) Pageable pageable) {
        System.out.println(search);
        Page<Supplier> supplierListDtoList = supplierService.showList(search, pageable);
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

    /**
     * Created By: CongTT
     * Date created: 27/02/2023
     * Function: create supplier
     * @param: supplierDto
     * @return: HttpStatus.BAD_REQUEST if result is error or HttpStatus.CREATED if result is not error.
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
     * @param: id
     * @return: HttpStatus.OK if result is not error.
     */

    @GetMapping("/supplier")
    private ResponseEntity<Supplier> findSupplier(@RequestParam(value = "id", defaultValue = "-1") Integer id) {
        Supplier supplier = supplierService.findSupplier(id);
        if (supplier == null || id == null || id == -1) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(supplier, HttpStatus.OK);
    }


    /**
     * Created By: CongTT
     * Date created: 27/02/2023
     * Function: update supplier
     * @param: supplierDto
     * @return: HttpStatus.BAD_REQUEST if result is error or HttpStatus.OK if result is not error.
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

    /**
     * Create by: TanTH,
     * Date created: 27/02/2023,
     * Function: show list supplier +Search supplier
     *
     * @param pageable
     * @return HttpStatus.OK
     */

    @GetMapping("/findSupplier")
    private ResponseEntity<?> showLists(@RequestParam(value = "name", defaultValue = "") String name, @RequestParam(value = "address", defaultValue = "") String address , @RequestParam(value = "email", defaultValue = "") String email, @PageableDefault(value = 3)Pageable pageable) {
        Page<Supplier> lists = supplierService.showSupplierList(name,address,email,pageable);
        return new ResponseEntity<>(lists, HttpStatus.OK);
    }
}
