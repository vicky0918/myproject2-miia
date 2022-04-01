package com.vicky.sale;

public class PlatinumCustomer extends CustomerTest{
    public PlatinumCustomer(String id,int amount){
        super(id, amount);
        off = 0.7f;
    }
    @Override
    public void print(){
        float offMoney = (amount/1000)*0.2f*1000;
        System.out.println(id + "\t" + amount + "\t" +amount*off+"\t"+"("+offMoney+")");
    }
}
