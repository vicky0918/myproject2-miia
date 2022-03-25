package com.vicky.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket
                (Station.TAIPEI_STATION, Station.TAICHUNG_STATION);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station?()");
        Station startStation = null;
        Station endStation = null;
        int choice = Integer.parseInt(scanner.next());

        switch (choice){
            case 1:
                startStation = Station.TAIPEI_STATION;
                break;
            case 2:
                startStation = Station.TAICHUNG_STATION;
                break;
            case 3:
                startStation = Station.KAOHSIUNG_STATION;
                break;
        }
    }




}
