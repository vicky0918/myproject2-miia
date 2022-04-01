package com.vicky.ticket;


public class StudentTicket extends Ticket{
    float off = 0.1f;
    public StudentTicket(Station station,Station destination){
        super(station,destination);
        price = price - (int)(price*off);
    }

}
