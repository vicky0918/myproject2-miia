package com.vicky.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    //Fields
    JButton button = new JButton("GUESS");
    JLabel label = new JLabel("Zzzzz...");
    JTextField number = new JTextField(8);
    //Constructors
    public GuessFrame(){

        super();
        System.out.println("secret:" );
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num = Integer.parseInt(number.getText());
                System.out.println(num);
                /*if(num >secret ){
                    label.setText("Smaller");
                }else if (num < secret){
                    label.setText("Bigger");
                }else{
                    label.setText("Bingo,the secret number is " + secret);
                }*/
//                label.setText("Hello!");
            }
        });
        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setVisible(true);
    }





    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
//        guessFrame.setSize(600,400);
//        guessFrame.setVisible(true);
    }

}
