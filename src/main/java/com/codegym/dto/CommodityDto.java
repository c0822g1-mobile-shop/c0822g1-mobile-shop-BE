package com.codegym.dto;

import com.codegym.model.commodity.Trademark;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class CommodityDto {
    private Integer id;
    @NotBlank(message = "Không được để trống")
    @Pattern(regexp = "^[a-zA-Z0-9\\+ ]*$", message = "Không chứa ký tự đặc biệt")
    @Length(min = 5, max = 200)
    private String name;
    @Pattern(regexp = "^[a-zA-Z0-9\\+ ]*$", message = "Không chứa ký tự đặc biệt")
    @NotBlank(message = "Không được để trống")
    @Length(min = 5, max = 50)
    private String cpu;
    @Length(min = 5, max = 20)
    @Pattern(regexp = "^[a-zA-Z0-9\\+ ]*$", message = "Không chứa ký tự đặc biệt")
    @NotBlank(message = "Không được để trống")
    private String capacity;
    private Double price;
    @Length(min = 3, max = 50)
    @Length(min = 5, max = 20)
    @NotBlank(message = "Không được để trống")
    private String image;
    @NotBlank(message = "Không được để trống")
    @Length(min = 5, max = 50)
    @Pattern(regexp = "^[a-zA-Z0-9\\+. ]*$", message = "Không chứa ký tự đặc biệt")
    private String camera;
    @Length(min = 5, max = 50)
    @Pattern(regexp = "^[a-zA-Z0-9\\+. ]*$", message = "Không chứa ký tự đặc biệt")
    @NotBlank(message = "Không được để trống")
    private String selfie;
    @Length(min = 5, max = 20)
    @Pattern(regexp = "^[a-zA-Z0-9\\+. ]*$", message = "Không chứa ký tự đặc biệt")
    @NotBlank(message = "Không được để trống")
    private String screenSize;
    @NotBlank(message = "Không được để trống")
    @Length(min = 5, max = 20)
    @Pattern(regexp = "^[a-vxyỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđ0-9 ]*$", message = "Không chứa ký tự đặc biệt")
    private String guarantee;
    @NotBlank(message = "Không được để trống")
    @Length(min = 5, max = 20)
    @Pattern(regexp = "^[a-vxyỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđA-Z ]*$", message = "Không chứa ký tự đặc biệt và số")
    private String origin;
    private String description;
    @NotBlank(message = "Không được để trống")
    @Length(min = 3, max = 10)
    @Pattern(regexp = "^[a-zA-Z0-9\\+ ]*$", message = "Không chứa ký tự đặc biệt")
    private String codeQr;
    private int quantity;
    private Boolean flag_delete = false;
    private int interestRate = 10;



    private Trademark trademark;

    public CommodityDto() {
    }


    public CommodityDto(Integer id, String name, String cpu, String capacity, Double price, String image, String camera, String selfie, String screenSize, String guarantee, String origin, String description, String codeQr, Integer quantity, Boolean flag_delete, Trademark trademark) {
        this.id = id;
        this.name = name;
        this.cpu = cpu;
        this.capacity = capacity;
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
        this.interestRate = interestRate;
        this.trademark = trademark;
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


    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Boolean getFlag_delete() {
        return flag_delete;
    }

    public void setFlag_delete(Boolean flag_delete) {
        this.flag_delete = flag_delete;
    }

    public Trademark getTrademark() {
        return trademark;
    }

    public void setTrademark(Trademark trademark) {
        this.trademark = trademark;
    }
}
