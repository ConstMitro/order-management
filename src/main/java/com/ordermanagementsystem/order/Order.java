package com.ordermanagementsystem.order;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
    @Id
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
