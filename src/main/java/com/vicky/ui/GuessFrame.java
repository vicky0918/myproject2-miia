package com.vicky.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    JButton button = new JButton("Hi");
    JLabel label = new JLabel("Zzzzz...");
    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                System.out.println("Hello!");
                label.setText("Hello!");
            }
        });
        setLayout(new FlowLayout());
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
