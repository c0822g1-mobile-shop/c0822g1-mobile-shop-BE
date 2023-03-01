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
    public ResponseEntity<Page<User>> getAllCustomer(@PageableDefault(size = 5) Pageable pageable, @RequestParam(required = false, defaultValue = "") String name, @RequestParam(required = false, defaultValue = "") String address) {
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
     * Create by: HuyNL
     * Date create: 27/2/2023
     * Function: list customer & list bill history
     *
     * @param genderSearch
     * @param ageSearch
     * @param pageable
     * @return HttpStatus.OK if result is not error
     */

    @GetMapping("search/{gender}&{age}")
    public ResponseEntity<Page<User>> findAll(@PathVariable(name = "genderSearch") String genderSearch,
                                              @PathVariable(name = "ageSearch") String ageSearch,
                                              Pageable pageable) {
        Page<User> userPage = userService.findAll(genderSearch, ageSearch, pageable);
        return new ResponseEntity<>(userPage, HttpStatus.OK);
    }
}
