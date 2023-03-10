package com.codegym.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SupplierDto implements Validator {
    private int id;
    @Pattern(regexp = "^\\d{6}$", message = "Mã số không đúng định dạng.")
    @NotBlank(message = "Không được để trống.")
    private String code;
    @Size(max = 100, message = "Tên nhà cung cấp không được quá 100 ký tự.")
    @NotBlank(message = "Không được để trống.")
    private String name;
    @Size(max = 200, message = "Địa chỉ không được quá 200 ký tự.")
    @NotBlank(message = "Không được để trống.")
    private String address;
    @NotBlank(message = "Không được để trống.")
    @Pattern(regexp = "^(0|\\+84)\\d{9}$", message = "Số điện thoại không đúng định dạng (Ví dụ: +84937110xxx / 0937110xxx).")
    private String phoneNumber;
    @NotBlank(message = "Không được để trống.")
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Email không đúng định dạng (Ví dụ: supplier-email@email.com).")
    private String email;
    private boolean flagDelete;


    public SupplierDto() {
    }

    public boolean isFlagDelete() {
        return flagDelete;
    }

    public void setFlagDelete(boolean flagDelete) {
        this.flagDelete = flagDelete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
