package com.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tkrud on 19.10.2022.
 */
public class ActionEventExample extends JFrame implements ActionListener {
    JButton button1;
    JButton button2;

    JButton button3;
    public void initUI() {
        this.setLayout(new GridLayout());
        button1 = new JButton("Click Me");
        button1.addActionListener(this);
        this.add(button1);

        button2 = new JButton("Also me!");
        button2.addActionListener(this);
        this.add(button2);

        button3 = new JButton("3 me!");
        button3.addActionListener(new ActionListener() { //klasa anonimowa z własą metodą actionPerformed
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 3 clicked");
            }
        });
        this.add(button3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(button1.equals(e.getSource())) {
            System.out.println("Click button1");
        } else if (button2.equals(e.getSource())){
            System.out.println("Click button2");
        }
    }

    public static void main(String[] args) {
        ActionEventExample frame = new ActionEventExample();

        frame.initUI();

        frame.setSize(640,480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
