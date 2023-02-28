package com.codegym.model.bill;

import com.codegym.model.commodity.Commodity;

import javax.persistence.*;

@Entity
public class BillHistory {
  @Id
  @GeneratedValue(strategy =  GenerationType.AUTO)
  private Integer id;
  @ManyToOne
  private Commodity commodity;
  @ManyToOne
  private Bill bill;

  public BillHistory() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
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
}
