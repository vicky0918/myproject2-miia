package com.vicky.sale;


public class DiscountCustomer extends CustomerTest{
    public DiscountCustomer(String id,int amount){
        super(id,amount);
        off = 0.9f;
    }
    public void print(){
        System.out.println(id +"\t"+amount+"\t"+amount*off);
    }
}
