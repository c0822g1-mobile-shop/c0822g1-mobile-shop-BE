package com.codegym.dto.billHistory;

import com.codegym.model.user.User;

public class BillHistoryDTO {
    private User user;
    private int quantity;

    public BillHistoryDTO() {
    }

    public BillHistoryDTO(User user, int quantity) {
        this.user = user;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
