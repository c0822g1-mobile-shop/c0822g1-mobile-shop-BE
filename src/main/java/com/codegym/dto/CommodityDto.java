package com.codegym.dto;

import com.codegym.model.commodity.Trademark;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

public class CommodityDto {
    private Integer id;
    @NotBlank(message = "Không được để trống")
    @Pattern(regexp = "^[a-zA-Z0-9\\+ ]*$", message = "Tên hàng không được nhập ký tự đặc biệt")
    @Length(min = 5, max = 200, message = "Tên hàng không được nhập ít hơn 5 chữ và dài quá 200 chữ")
    private String name;
    @Pattern(regexp = "^[-a-zA-Z0-9\\+ ]*$", message = "CPU không được nhập ký tự đặc biệt")
    @NotBlank(message = "Không được để trống")
    @Length(min = 5, max = 50, message = "CPU không được nhập ít hơn 5 chữ và dài quá 200 chữ")
    private String cpu;
    @Length(min = 5, max = 20, message = "Lưu trữ không được nhập ít hơn 5 chữ và dài quá 20 chữ")
    @Pattern(regexp = "^[0-9]* [G][B]$", message = "Lưu trữ không được nhập ký tự đặc biệt")
    @NotBlank(message = "Không được để trống")
    private String capacity;
    @Min(value = 0, message = "Giá không được nhập nhỏ hơn 0")
    @Max(value = 2000000000, message = "Giá không được nhập quá 2.000.000.000")
    private Double price;
    @Length(min = 5, max = 200, message = "Đường dẫn ảnh quá dài")
    @NotBlank(message = "Không được để trống")
    private String image;
    @NotBlank(message = "Không được để trống")
    @Length(min = 2, max = 50, message = "Camera không được nhập ít hơn 5 chữ và dài quá 50 chữ")
    @Pattern(regexp = "^[0-9]* [M][P]$", message = "Camera không được nhập ký tự đặc biệt")
    private String camera;
    @Length(min = 2, max = 50)
    @Pattern(regexp = "^[0-9]* [M][P]$", message = "Selfie không được nhập ký tự đặc biệt")
    @NotBlank(message = "Không được để trống")
    private String selfie;
    @Length(min = 5, max = 20)
    @Pattern(regexp = "^[0-9.]* [a-z]*$", message = "Kích thước màn hình không được nhập ký tự đặc biệt")
    @NotBlank(message = "Không được để trống")
    private String screenSize;
    @NotBlank(message = "Không được để trống")
    @Length(min = 1, max = 2)
    @Pattern(regexp = "^[0-9]*$", message = "Thời gian bảo hành không được nhập ký tự đặc biệt")
    private String guarantee;
    @NotBlank(message = "Không được để trống")
    @Length(min = 1, max = 20)
    @Pattern(regexp = "^[a-vxyỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđA-Z ]*$", message = "Xuất xứ không được nhập ký tự đặc biệt và số")
    private String origin;
    private String description;
    @NotBlank(message = "Không được để trống")
    @Pattern(regexp = "^[Q][R][0-9]*$", message = "Mã QR không được nhập ký tự đặc biệt")
    private String codeQr;
    private int quantity;
    private Boolean flagDelete = false;
    private Integer interestRate = 10;
    private Trademark trademark;

    public CommodityDto() {
    }

    public CommodityDto(Integer id, String name, String cpu, String capacity, Double price, String image, String camera, String selfie, String screenSize, String guarantee, String origin, String description, String codeQr, int quantity, Boolean flag_delete, int interestRate, Trademark trademark) {
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
        this.interestRate = interestRate;
        this.flagDelete = flag_delete;
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
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Boolean getFlagDelete() {
        return flagDelete;
    }

    public void setFlagDelete(Boolean flagDelete) {
        this.flagDelete = flagDelete;
    }

    public Boolean getFlag_delete() {
        return flagDelete;
    }

    public void setFlag_delete(Boolean flag_delete) {
        this.flagDelete = flag_delete;
    }

    public Trademark getTrademark() {
        return trademark;
    }

    public void setTrademark(Trademark trademark) {
        this.trademark = trademark;
    }
}
