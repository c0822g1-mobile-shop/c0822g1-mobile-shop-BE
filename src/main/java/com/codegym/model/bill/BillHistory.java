package com.codegym.model.bill;

import com.codegym.model.commodity.Commodity;
import com.codegym.model.user.User;

import javax.persistence.*;

@Entity
public class BillHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
//  @JoinColumn(name = "commodity_id", referencedColumnName = "id")
    private Commodity commodity;

    @ManyToOne
//  @JoinColumn(name = "bill_id", referencedColumnName = "id")
    private Bill bill;

    @ManyToOne
    private User user;

    public BillHistory() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
