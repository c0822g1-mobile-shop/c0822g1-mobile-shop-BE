package com.codegym.model.commodity;

import javax.persistence.*;

@Entity
public class Commodity {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String cpu;
    private String capacity;
    private Double price;
    private String image;
    private String camera;
    private String selfie;
    private String screenSize;
    private String guarantee;
    private String origin;
    private String description;
    private String codeQr;
    private Integer quantity;
    private Boolean flagDelete;
    @ManyToOne
    private Trademark trademark;


    private int interestRate = 10;



    public Commodity() {

    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
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

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCodeQr() {
        return codeQr;
    }

    public void setCodeQr(String codeQr) {
        this.codeQr = codeQr;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Boolean getFlagDelete() {
        return flagDelete;
    }

    public void setFlagDelete(Boolean flagDelete) {
        this.flagDelete = flagDelete;
    }

    public Trademark getTrademark() {
        return trademark;
    }

    public void setTrademark(Trademark trademark) {
        this.trademark = trademark;
    }
    public boolean isFlagDelete() {
        return flagDelete;
    }

    public void setFlagDelete(boolean flagDelete) {
        this.flagDelete = flagDelete;
    }



}
