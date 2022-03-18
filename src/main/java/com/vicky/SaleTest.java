package com.vicky;

public class SaleTest {
    public static void main(String[] args) {
        CustomerTest c1 = new CustomerTest("0001",1200);
        CustomerTest c2 = new CustomerTest("0002",800);
        SilverCustomer c3 = new SilverCustomer("0003",2000);
        GoldenCustomer c4 = new GoldenCustomer("0004",5000);

        c1.print();
        c2.print();
        c3.print();
        c4.print();
    }

}
