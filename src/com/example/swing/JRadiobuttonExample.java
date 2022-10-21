package com.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by tkrud on 19.10.2022.
 */
public class JRadiobuttonExample extends JFrame {
    public static void main(String[] args) {
        JRadiobuttonExample frame = new JRadiobuttonExample();

        JRadioButton b1 = new JRadioButton("Car");
        JRadioButton b2 = new JRadioButton("Plane");
        JRadioButton b3 = new JRadioButton("Train");

        ButtonGroup group = new ButtonGroup();
        group.add(b1);
        group.add(b2);
        group.add(b3);



        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton b = (JRadioButton) e.getSource();
                System.out.println("clicked: " + b.getText());
              //  System.out.println(b1.isSelected());
            }
        };

        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);


        frame.setLayout(new FlowLayout());
        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
