package com.example.swing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tkrud on 19.10.2022.
 */
public class JPasswordFieldExample extends JFrame{
    public static void main(String[] args) {
        JPasswordFieldExample frame = new JPasswordFieldExample();

        JPasswordField jp = new JPasswordField(10);
        frame.add(jp);

        jp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("password: " + new String(jp.getPassword()));
            }
        });

        frame.setLayout(new FlowLayout());
        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
