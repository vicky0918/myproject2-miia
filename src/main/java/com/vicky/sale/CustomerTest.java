package com.vicky.sale;

public class CustomerTest {
    String id;
    int amount;
    float off = 0.1f;
    public CustomerTest(String id,int amount){
        this.id = id;
        this.amount = amount;
    }
    public float backMoney(){
        return (amount/1000)*off*1000;
    }

    public void print(){
        float offMoney = (amount/1000)*off*1000;
        System.out.println(id + "\t" + amount + "\t" + (amount-offMoney));
    }
}
