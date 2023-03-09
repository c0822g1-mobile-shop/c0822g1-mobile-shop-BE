package com.codegym.dto;

import com.codegym.model.user.User;

import javax.persistence.ManyToOne;

public class BillBuyDTO {
    private Integer id;
    private String buyDate;
    private String detail;
    private int quantity;
    private String paymentMethod;
    private Boolean billPrint;
    private Integer userId;
    private Integer commodityId;

    public BillBuyDTO() {
    }

    public BillBuyDTO(Integer id, String buyDate, String detail, int quantity, String paymentMethod, Boolean billPrint, Integer userId, Integer commodityId) {
        this.id = id;
        this.buyDate = buyDate;
        this.detail = detail;
        this.quantity = quantity;
        this.paymentMethod = paymentMethod;
        this.billPrint = billPrint;
        this.userId = userId;
        this.commodityId = commodityId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(String buyDate) {
        this.buyDate = buyDate;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Boolean getBillPrint() {
        return billPrint;
    }

    public void setBillPrint(Boolean billPrint) {
        this.billPrint = billPrint;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }
}
