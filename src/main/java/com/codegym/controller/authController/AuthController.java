package com.codegym.controller.authController;

import com.codegym.dto.request.ChangePasswordForm;
import com.codegym.dto.request.SignInForm;
import com.codegym.dto.request.SignUpForm;
import com.codegym.dto.request.UpdateUserForm;
import com.codegym.dto.response.JwtResponse;
import com.codegym.dto.response.ResponseMessage;
import com.codegym.model.user.Role;
import com.codegym.model.user.User;
import com.codegym.security.jwt.JwtProvider;
import com.codegym.security.userPrincipcal.UserPrinciple;
import com.codegym.service.IRoleService;
import com.codegym.service.IUserService;
import com.codegym.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@RequestMapping("/api/auth")
@RestController
@CrossOrigin("*")
public class AuthController {
    @Autowired
    private IUserService iUserService =new UserService();
    @Autowired
    private IRoleService iRoleService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtProvider jwtProvider;
    /**
     * Created by: CuongVV
     * Date created: 27/2/2023
     * Function: sign up to create user with sign up form
     * @param signUpForm
     * @return
     */
    @PostMapping("/signup")
    public ResponseEntity<?> register(@Valid @RequestBody SignUpForm signUpForm,BindingResult bindingResult) {
        new SignUpForm().validate(iUserService.findAll(),signUpForm,bindingResult);
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(bindingResult.getFieldErrors(),HttpStatus.BAD_REQUEST);
        }
        if (iUserService.existsByUsername(signUpForm.getUsername())) {
            return new ResponseEntity<>(new ResponseMessage("T??n ????ng " + signUpForm.getUsername() + " nh???p ???? ???????c s??? d???ng, vui l??ng ch???n t??n kh??c"), HttpStatus.BAD_REQUEST);
        }
        if (iUserService.existsByEmail(signUpForm.getEmail())) {
            return new ResponseEntity<>(new ResponseMessage("Email " + signUpForm.getEmail() + " ???? ???????c s??? d???ng"), HttpStatus.BAD_REQUEST);
        }
        User user = new User(signUpForm.getUsername(), passwordEncoder.encode(signUpForm.getPassword()), signUpForm.getName(), signUpForm.getEmail());
        Set<String> strRoles = signUpForm.getRoles();
        Set<Role> roles = new HashSet<>();
        strRoles.forEach(role -> {
            switch (role) {
                case "admin":
                    Role roleAdmin = iRoleService.roleAdmin().orElseThrow(() -> new RuntimeException("Role not found 1"));
                    roles.add(roleAdmin);
                    break;
                case "employee":
                    Role roleEmployee = iRoleService.roleEmployee().orElseThrow(() -> new RuntimeException("Role not found 2"));
                    roles.add(roleEmployee);
                    break;
                default:
                    Role roleCustomer = iRoleService.roleCustomer().orElseThrow(() -> new RuntimeException("Role not found 3"));
                    roles.add(roleCustomer);
            }
        });
        user.setRoles(roles);
        iUserService.save(user);
        return new ResponseEntity<>(new ResponseMessage("????ng k?? th??nh c??ng"), HttpStatus.OK);
    }
    /**
     * Created by: CuongVV
     * Date created: 27/2/2023
     * Function: login with only username and password
     * @param signInForm
     * @return
     */
    @PostMapping("/login")

    public ResponseEntity<?> login( @RequestBody SignInForm signInForm ) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(signInForm.getUsername(), signInForm.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtProvider.createToken(authentication);
        UserPrinciple userPrinciple = (UserPrinciple) authentication.getPrincipal();
        return ResponseEntity.ok(new JwtResponse(token, userPrinciple.getName(), userPrinciple.getId(), userPrinciple.getUsername(), userPrinciple.getEmail(), userPrinciple.getPassword(), userPrinciple.getAvatar()
                ,userPrinciple.getPhoneNumber(),
                userPrinciple.getAddress(),
                userPrinciple.getAge(),
                userPrinciple.getGender(),
                userPrinciple.getDateOfBirth()
                , userPrinciple.getAuthorities()));
    }
    /**
     * Created by: CuongVV
     * Date created: 27/2/2023
     * Function: change password for user
     * @param changePasswordForm
     * @return
     */
    @PostMapping("/change-password")
    public ResponseEntity<?> changePassword(@Valid @RequestBody ChangePasswordForm changePasswordForm,BindingResult bindingResult) {
        if (!Objects.equals(changePasswordForm.getNewPassword(), changePasswordForm.getConfirmPassword())) {
            bindingResult.rejectValue("confirmPassword","confirmPassword","M???t kh???u x??c nh???n kh??ng tr??ng v???i m???t kh???u m???i");
//            return new  ResponseEntity<>(new ResponseMessage("M???t kh???u x??c nh???n " +
//                    changePasswordForm.getConfirmPassword() +" kh??ng tr??ng v???i m???t kh???u m???i " + changePasswordForm.getNewPassword()),HttpStatus.BAD_REQUEST);
        }
        User user = iUserService.findByUsername(changePasswordForm.getUsername()).orElse(null);
        assert user != null;
        if (!passwordEncoder.matches(changePasswordForm.getPassword(), user.getPassword())) {
            bindingResult.rejectValue("password","password","B???n ???? nh???p sai m???t kh???u c??");
        }
         if (bindingResult.hasErrors()) {
             return new ResponseEntity<>(bindingResult.getFieldErrors(),HttpStatus.BAD_REQUEST);
         }
        if (passwordEncoder.matches(changePasswordForm.getPassword(), user.getPassword())) {
            user.setPassword(passwordEncoder.encode(changePasswordForm.getNewPassword()));
            iUserService.changePassword(user.getPassword(),user.getUsername());
            return new ResponseEntity<>(new ResponseMessage("C???p nh???t m???t kh???u th??nh c??ng"),HttpStatus.OK);
        }
        return new ResponseEntity<>(new ResponseMessage("Thay ?????i m???t kh???u th???t b???i"),HttpStatus.BAD_REQUEST);
    }

    /**
     * Created by: CuongVV
     * Date created: 27/2/2023
     * Function: logout to close connect to server
     * @param: none
     */
    @GetMapping("/logout")
    public ResponseEntity<?> logout(HttpServletRequest request, HttpServletResponse response){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);

            return new ResponseEntity<>(new ResponseMessage("????ng xu???t th??nh c??ng"),HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(new ResponseMessage("????ng xu???t th???t b???i"),HttpStatus.NOT_ACCEPTABLE);
    }
    /**
     * Created by: CuongVV
     * Date created: 27/2/2023
     * Function: update user
     * @param: none
     */
    @PostMapping("/update")
    public ResponseEntity<?> updateUser(@Valid @RequestBody UpdateUserForm updateUserForm,BindingResult bindingResult) {
       new UpdateUserForm().validate(iUserService.findAll(),updateUserForm,bindingResult);
        if (bindingResult.hasErrors()) {
           return new ResponseEntity<>(bindingResult.getFieldErrors(),HttpStatus.NOT_ACCEPTABLE);
       }
        iUserService.updateUser(updateUserForm);
        return new ResponseEntity<>(new ResponseMessage("Ch???nh s???a th??ng tin th??nh c??ng"),HttpStatus.ACCEPTED);
    }
    /**
     * Created by: CuongVV
     * Date created: 27/2/2023
     * Function: get all customer
     * @param: none
     */
    @GetMapping("/customer")
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(iUserService.findAll(),HttpStatus.OK);
    }

    @GetMapping("/profile/{username}")
    public ResponseEntity<?> profile(@PathVariable("username") String username) {
        return new ResponseEntity<>(iUserService.userLogin(username),HttpStatus.ACCEPTED);
    }
}
