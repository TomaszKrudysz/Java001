package com.example.swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by tkrud on 22.10.2022.
 */
public class BorderLayoutManagerExample {

    public static void main(String[] args)  {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());

        Border border = BorderFactory.createLineBorder(Color.BLACK);

        JLabel north = new JLabel("North", JLabel.CENTER);
        north.setBorder(border);
        frame.add(north, BorderLayout.NORTH);

        JLabel west = new JLabel("west", JLabel.CENTER);
        west.setBorder(border);
        frame.add(west, BorderLayout.WEST);

        JLabel east = new JLabel("east", JLabel.CENTER);
        east.setBorder(border);
        frame.add(east, BorderLayout.EAST);

        JLabel south = new JLabel("south", JLabel.CENTER);
        south.setBorder(border);
        frame.add(south, BorderLayout.SOUTH);

        JLabel center = new JLabel("center", JLabel.CENTER);
        center.setBorder(border);
        frame.add(center, BorderLayout.CENTER);

        frame.setSize(1000  ,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
