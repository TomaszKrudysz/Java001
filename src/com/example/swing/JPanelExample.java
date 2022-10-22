package com.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tkrud on 22.10.2022.
 */
public class JPanelExample extends JFrame {
    public static void main(String[] args) {
        JPanelExample frame = new JPanelExample();

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.add(new JLabel("label"));
        panel.add(new JButton("Click my"));
        panel.setPreferredSize(new Dimension(150, 150));
        frame.add(panel);



        frame.setLayout(new FlowLayout());
        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
