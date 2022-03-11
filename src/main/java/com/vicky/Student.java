package com.vicky;

public class Student {
    String name;
    int english;
    int math;
    public  Student(String name){
        this.name = name;
    }
    public Student(String name,int english,int math){
        this(name);
        //this.name = name;
        this.math = math;
        this.english = english;
    }
    public Student(){
        this("Jone Doe",-1,-1);
        /*name = "Jone Doe";
        english = -1;
        math = -1;*/
    }

    public void print(){
        int average = (english + math)/2;
        System.out.print(name + "\t"
                + math + "\t" + english+ average);
        if(average < 60){
            System.out.print("*");
        }
        System.out.println();
    }
}
