package com.vicky;

public class Customer {
    String id;
    int original_price;
    float off = 0.1f;
    public Customer(String id,int original_price){
        this.id = id;
        this.original_price = original_price;
    }

    public float backMoney(){
        return (original_price/1000)*off*1000;
    }
    public void print(){
        float offMoney = (original_price/1000)*off*1000;
        System.out.println(id + "\t" + original_price + "\t" + (original_price-offMoney));
    }
}
