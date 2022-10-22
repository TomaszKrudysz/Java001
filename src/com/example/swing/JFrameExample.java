package com.example.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by tkrud on 22.10.2022.
 */
public class JFrameExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.add(new JButton("button1"));
        frame.add(new JLabel("Label 1"));
        frame.setLayout(new FlowLayout());
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
