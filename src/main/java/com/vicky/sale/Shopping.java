package com.vicky.sale;


public class Shopping {
    public static void main(String[] args) {
        Customer a1 = new Customer("0001",1200);
        Customer a2 = new Customer("0002",800);
        Customer a3 = new Customer("0003",2000);
        SilverCustomer a4 = new SilverCustomer("0004",2000);
        GoldenCustomer a5 = new GoldenCustomer("0005",5000);

        a1.print();
        a2.print();
        a3.print();
        a4.print();
        a5.print();
    }
}
