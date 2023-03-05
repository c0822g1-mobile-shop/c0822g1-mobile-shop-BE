package com.codegym.dto.request;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UpdateUserForm {
    @NotBlank(message = "Vui lòng không bỏ trống họ và tên")
    private String name;
    private String username;
    @NotBlank(message = "Vui lòng nhập số điện thoại")
    private String phoneNumber;
    @NotBlank(message = "Vui lòng nhập địa chỉ email")
    private String email;
    @NotBlank(message = "Vui lòng không bỏ trống địa chỉ")
    private String address;
    @NotNull(message = "Vui lòng nhập số tuổi")
    private Integer age;
    @NotNull(message = "Vui lòng chọn giới tính")
    private Boolean gender;
    @NotBlank(message = "Vui lòng không bỏ trống ngày sinh")
    private String dateOfBirth;
    @NotBlank(message = "Vui lòng không bỏ trống ảnh đại diện")
    private String avatar;

    public UpdateUserForm() {
    }

    public UpdateUserForm(String name, String username, String phoneNumber, String email, String address, Integer age, Boolean gender, String dateOfBirth, String avatar) {
        this.name = name;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
