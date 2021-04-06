package com.godxvincent.spring5learning.models;

public class Withdraw {

    private Double amount;
    private String date;
    private Long ATM_Id;


    public Withdraw() {
    }

    public Withdraw(Double amount, String date, Long ATM_Id) {
        this.amount = amount;
        this.date = date;
        this.ATM_Id = ATM_Id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getATM_Id() {
        return ATM_Id;
    }

    public void setATM_Id(Long ATM_Id) {
        this.ATM_Id = ATM_Id;
    }
}
