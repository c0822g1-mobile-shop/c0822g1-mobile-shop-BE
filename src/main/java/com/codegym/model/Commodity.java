package com.codegym.model;

import javax.persistence.*;

@Entity
public class Commodity {
<<<<<<< HEAD:src/main/java/com/codegym/model/Commodity.java
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
=======


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
>>>>>>> origin/develop:src/main/java/com/codegym/model/commodity/Commodity.java
    private String name;
    private String cpu;
    private String capacity;
    private String trademArk;
    private double price;
    private String image;
    private String camera;
    private String selfie;
    private String screensize;
    private String guarantee;
    private String origin;
    private String decription;
    private String codeQr;
    private int quantity;
    private boolean flagDelete;


    private int interestRate = 10;

    public Commodity() {

    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
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

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getTrademArk() {
        return trademArk;
    }

    public void setTrademArk(String trademArk) {
        this.trademArk = trademArk;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getSelfie() {
        return selfie;
    }

    public void setSelfie(String selfie) {
        this.selfie = selfie;
    }

    public String getScreensize() {
        return screensize;
    }

    public void setScreensize(String screensize) {
        this.screensize = screensize;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getCodeQr() {
        return codeQr;
    }

    public void setCodeQr(String codeQr) {
        this.codeQr = codeQr;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isFlagDelete() {
        return flagDelete;
    }

    public void setFlagDelete(boolean flagDelete) {
        this.flagDelete = flagDelete;
    }
}
