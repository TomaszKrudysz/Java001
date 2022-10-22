package com.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tkrud on 22.10.2022.
 */
public class JToolBarExample extends JFrame {
    public static void main(String[] args) {
        JToolBarExample frame = new JToolBarExample();

        JToolBar toolBar = new JToolBar();
        JButton b1 = new JButton("click my");
        toolBar.add(b1);

        JToggleButton b2 = new JToggleButton("Click my to!");
        toolBar.add(b2);

        frame.add(toolBar);



        frame.setLayout(new FlowLayout());
        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
