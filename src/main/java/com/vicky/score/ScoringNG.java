package com.vicky.score;


public class ScoringNG {
    public static void main(String[] args) {
        String[] names = {"Vicky","Sammy","Apple","Harry","Bonny"};
        int[] englishs = {70,80,90,50,30};
        int[] maths = {90,66,75,80,60};
        for (int i = 0;i<5;i++){
            if (i!=3){
                System.out.println(names[i]+"\t"+englishs[i]+"\t"+maths[i]+"\t"+(maths[i]+englishs[i])/2+"\t");
            }

        }
    }

}
