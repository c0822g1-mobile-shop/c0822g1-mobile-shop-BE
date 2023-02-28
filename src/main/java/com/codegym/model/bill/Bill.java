package com.codegym.model.bill;

import com.codegym.model.user.User;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Bill {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String buyDate;
    private String detail;
    private int quantity;
    private String paymentMethod;
//    private Boolean billPrint;
    private Boolean billPrint;
    @ManyToOne
    private User user;

    @OneToMany
    private Set<BillHistory> billHistorySet = new HashSet<>();

    public Bill() {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<BillHistory> getBillHistorySet() {
        return billHistorySet;
    }

    public void setBillHistorySet(Set<BillHistory> billHistorySet) {
        this.billHistorySet = billHistorySet;
    }
}
