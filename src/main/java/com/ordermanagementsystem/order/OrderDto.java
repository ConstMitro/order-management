package com.ordermanagementsystem.order;


public class OrderDto {
    private Integer id;
    private float value;
    private String currency;
    private String status;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public float getValue() {
        return value;
    }
    public void setValue(float value){
        this.value = value;
    }
    public String getCurrency() {return currency;}
    public void setCurrency(String currency){
        this.currency = currency;
    }
    public String getStatus() {return status;}
    public void setStatus(String status) { this.status = status; }
}

