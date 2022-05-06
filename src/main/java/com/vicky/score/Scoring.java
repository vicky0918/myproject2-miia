package com.vicky.score;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        List<Student> scores = new ArrayList<>();
        scores.add(new Student("Vicky",70,90));
        scores.add(new Student("Hank",60,43));
        scores.add(new GraduateStudent("Jane",80,68,60));

    }
        /*Student vicky = new Student("Vicky",70,90);
        Student hank = new Student("Hank",60,43);
        GraduateStudent jane =
                new GraduateStudent("Jane",80,68,60);
        List<Student> students = new ArrayList<>();
        students.add(vicky);
        students.add(hank);
        students.add(jane);*/

}
