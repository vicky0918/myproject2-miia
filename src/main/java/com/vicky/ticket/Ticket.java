package com.vicky.ticket;

import java.util.Scanner;

public class Ticket {

    public static final int TAIPEI_STATION = 100;
    public static final int TAICHUNG_STATION = 200;
    public static final int KAOHSIUNG_STATION = 300;

    Station start;
    Station destination;
    int price;
    int number;

    public Ticket(Station start,Station destination){
        Scanner scanner = new Scanner(System.in);
        this.start = start;
        this.destination = destination;
        int diff = Math.abs(start.id - destination.id);
        System.out.print("diff:" + diff);
        switch (diff){
            case 100:
                price = 500;
                break;
            case 200:
                price = 600;
                break;
            case 300:
                price = 1100;
                break;
        }

        /*if(start==Station.TAIPEI_STATION){
            if(destination==Station.TAICHUNG_STATION){
                price = 600;
            }else{
                price = 1500;
            }
        }else if (start==Station.TAICHUNG_STATION){
            if(destination== Station.KAOHSIUNG_STATION){
                price = 900;
            }else{
                price = 600;
            }
        }else if (start==Station.KAOHSIUNG_STATION){
            if(destination== Station.TAIPEI_STATION){
                price = 1500;
            }else{
                price = 900;
            }
        }*/
        System.out.println("How many?");
        number = Integer.parseInt(scanner.next());
    }

    public void print(){
        System.out.println(start.name + "\t" + destination.name + "\t" + number + "\t" + price*number);
    }




}
