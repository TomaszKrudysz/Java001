package com.example.swing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

/**
 * Created by tkrud on 22.10.2022.
 */
public class JScrollPaneExample extends JFrame {
    public static void main(String[] args) {
        JScrollPaneExample frame = new JScrollPaneExample();

        JTextArea area = new JTextArea(20,20);
        JScrollPane scrollPane = new JScrollPane(area);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);


        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(200  ,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
