package com.ordermanagementsystem.order;


public class OrderDto {
    private int id;
    private float value;
    private String currency;

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public float getValue() {
        return value;
    }
    public void setValue(float value){
        this.value = value;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency){
        this.currency = currency;
    }
}

