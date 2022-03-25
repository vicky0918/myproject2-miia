package com.vicky.score;

public class Scoring {
    public static void main(String[] args) {
        Student vicky = new Student("Vicky",70,90);
        Student hank = new Student("Hank",60,43);
        GraduateStudent jane =
                new GraduateStudent("Jane",80,68,60);
        vicky.print();
        hank.print();
        jane.print();
    }
}
