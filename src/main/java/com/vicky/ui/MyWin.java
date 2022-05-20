package com.vicky.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin {
    public static void main(String[] args) {
        //swing,SWT,JavaFX
        //extension
        JFrame frame = new JFrame();      //產生方框在左上角，XY座標可設定
        frame.setSize(600,400);
        frame.setLocation(300,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);     //關閉視窗，清空資源
        //add Component
        JButton button = new JButton("OK");     //Ctrl+P可以查可放入內容
        //匿名類別,Anonymous class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello World~");
            }
        });
//        MyActionListener listener = new MyActionListener();
//        button.addActionListener(listener);
        //Layout
        //frame.setLayout(new BorderLayout());
        frame.setLayout(new FlowLayout());
        frame.add(button);

        frame.setVisible(true);
        System.out.println("END?");
    }
}
