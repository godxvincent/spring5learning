package com.godxvincent.spring5learning.models;

public class ATM {
    private Double money;

    public ATM() {
    }

    public ATM(Double money) {
        this.money = money;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
