package com.codegym.dto;

public class CommodityDto {
    private Integer id;
    private String name;
    private String cpu;
    private String capacity;
    private String trademark;
    private double price;
    private String image;
    private String camera;
    private String selfie;
    private String screenSize;
    private String guarantee;
    private String origin;
    private String description;
    private String codeQr;
    private int quantity;
    private boolean flag_delete;

    public CommodityDto() {
    }

    public CommodityDto(Integer id, String name, String cpu, String capacity, String trademark, double price, String image, String camera, String selfie, String screenSize, String guarantee, String origin, String description, String codeQr, int quantity, boolean flag_delete) {
        this.id = id;
        this.name = name;
        this.cpu = cpu;
        this.capacity = capacity;
        this.trademark = trademark;
        this.price = price;
        this.image = image;
        this.camera = camera;
        this.selfie = selfie;
        this.screenSize = screenSize;
        this.guarantee = guarantee;
        this.origin = origin;
        this.description = description;
        this.codeQr = codeQr;
        this.quantity = quantity;
        this.flag_delete = flag_delete;
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

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isFlag_delete() {
        return flag_delete;
    }

    public void setFlag_delete(boolean flag_delete) {
        this.flag_delete = flag_delete;
    }
}
