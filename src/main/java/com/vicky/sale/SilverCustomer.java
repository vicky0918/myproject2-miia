package com.vicky.sale;

import com.vicky.sale.CustomerTest;

public class SilverCustomer extends CustomerTest {
    public SilverCustomer(String id,int amount){
        super(id, amount);
    }
    @Override
    public void print(){
        System.out.println(id + "\t" + amount + "\t" + (amount-backMoney()+"("+backMoney()+")"));
    }

}
