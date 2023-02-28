package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD:src/main/java/com/codegym/model/User.java
    private int id;
    private String name;
=======
    private Integer id;
    @Column(columnDefinition = "varchar(6)", unique = true)
    private String code;
    private String name;
    private String address;
    @Column(name = "phone_number", unique = true)
>>>>>>> origin/develop:src/main/java/com/codegym/model/supplier/Supplier.java
    private String phoneNumber;
    @Column(unique = true)
    private String email;
<<<<<<< HEAD:src/main/java/com/codegym/model/User.java
    private String address;
    private int age;
    private boolean gender;
    private String dateOfBirth;
=======
    @Column(columnDefinition = "boolean")
    private boolean flagDelete;
>>>>>>> origin/develop:src/main/java/com/codegym/model/supplier/Supplier.java

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

<<<<<<< HEAD:src/main/java/com/codegym/model/User.java
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
=======
    public boolean isFlagDelete() {
        return flagDelete;
    }

    public void setFlagDelete(boolean flagDelete) {
        this.flagDelete = flagDelete;
>>>>>>> origin/develop:src/main/java/com/codegym/model/supplier/Supplier.java
    }
}
