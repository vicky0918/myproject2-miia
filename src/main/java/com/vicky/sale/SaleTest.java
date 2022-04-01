package com.vicky.sale;

import java.util.ArrayList;
import java.util.List;

public class SaleTest {
    public static void main(String[] args) {
        List<CustomerTest> customers = new ArrayList<>();
        customers.add(new CustomerTest("0001",1200));
        customers.add(new CustomerTest("0002",800));
        customers.add(new SilverCustomer("0003",2000));
        customers.add(new GoldenCustomer("0004",5000));
        customers.add(new DiscountCustomer("0006",900));
        customers.add(new PlatinumCustomer("0007",3000));
        for (int i=0;i<5;i++){
            customers.get(i).print();
        }
        for (CustomerTest c: customers){
            c.print();
        }



    }

}
