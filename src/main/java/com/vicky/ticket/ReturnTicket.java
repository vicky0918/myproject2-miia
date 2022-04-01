package com.vicky.ticket;

public class ReturnTicket extends Ticket{
    float off = 0.1f;
    public ReturnTicket(Station station,Station destination){
        super(station,destination);
        price = (price - (int)(price*off))*2;
    }
}
