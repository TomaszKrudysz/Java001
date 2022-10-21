package com.example.swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tkrud on 19.10.2022.
 */
public class JLabelExample extends JFrame {
    public static void main(String[] args) {
        JLabelExample frame = new JLabelExample();

        JLabel label1 = new JLabel("Tekst");
        label1.setText("<html><u>Nowy tekst</u></html>");

        label1.setBounds(10,10,80,50);
        label1.setForeground(Color.BLUE);
        label1.setOpaque(true);
        label1.setBackground(Color.WHITE);
        label1.setHorizontalAlignment(JLabel.CENTER);
        Border border = BorderFactory.createLineBorder(Color.RED,10);
        label1.setBorder(border);

        frame.add(label1);

        frame.setLayout(null);
        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}