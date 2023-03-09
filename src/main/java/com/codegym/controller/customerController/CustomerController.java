package com.codegym.controller.customerController;

import com.codegym.model.user.User;
import com.codegym.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private IUserService userService;

    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get all customer
     *
     * @param pageable
     * @param name
     * @param address
     * @return HttpStatus.NOT_FOUND if result is error. HttpStatus.OK if result is not error.
     */
    @GetMapping("")
    public ResponseEntity<Page<User>> getAllCustomer(
            @PageableDefault(size = 5) Pageable pageable,
            @RequestParam(required = false, defaultValue = "") String name, @RequestParam(required = false, defaultValue = "") String address) {
        Page<User> userPage;
        if (name == null && address == null) {
            userPage = userService.findAllCustomerNoParam(pageable);
        } else {
            userPage = userService.findAllCustomer(pageable, name, address);
        }
        if (userPage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(userPage, HttpStatus.OK);
    }

    /**
     * Created by: LongPT
     * Date created: 27/2/2023
     * Function: get customer by id
     *
     * @param id
     * @return HttpStatus.NOT_FOUND if result is error, id null or id not in database. HttpStatus.OK if result is not error.
     */
    @GetMapping("{id}")
    public ResponseEntity<Optional<User>> getCustomerById(@PathVariable("id") Integer id) {
        Optional<User> user;
        if (id == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            user = userService.findCustomerById(id);
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
    }

    /**
     * Created by: HuyNL
     * Date created: 1/3/2023
     * Function: get customer by id
     *
     * @param ageSearch
     * @param genderSearch
     * @param pageable
     */
    @GetMapping("/search")
    public ResponseEntity<Page<User>> findAll(@RequestParam(defaultValue = "") String genderSearch,
                                              @RequestParam(defaultValue = "") String ageSearch,
                                              @PageableDefault(size = 5) Pageable pageable) {
        Page<User> userPage = userService.findAll(genderSearch, ageSearch, pageable);
        return new ResponseEntity<>(userPage, HttpStatus.OK);
    }

    @GetMapping("/getList")
    public ResponseEntity<List<User>> getAllCustomer() {
        return new ResponseEntity<>(userService.findAllCustomer(), HttpStatus.OK);
    }
}
