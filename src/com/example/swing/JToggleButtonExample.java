package com.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tkrud on 22.10.2022.
 */
public class JToggleButtonExample extends JFrame {
    public static void main(String[] args) {
        JToggleButtonExample frame = new JToggleButtonExample();

        JToggleButton toggleButton = new JToggleButton("click my");
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("selected: " + toggleButton.isSelected());
            }
        });

        frame.add(toggleButton);


        frame.setLayout(new FlowLayout());
        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
