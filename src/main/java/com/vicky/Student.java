package com.vicky;

public class Student {
    String name; //在類別裡面的第一層是屬性
    int english;
    int math;
    public  Student(String name) {
        this.name = name;
    } //建構子裡面有方法
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
        System.out.print(name + "\t"
                + math + "\t" + english+"\t"+ getAverage());
        if(getAverage() < 60){
            System.out.print("*");
        }
        System.out.println();
    }
    public int getAverage(){
       return ((math+english)/2);
    }
}
