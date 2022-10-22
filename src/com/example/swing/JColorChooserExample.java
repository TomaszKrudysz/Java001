package com.example.swing;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
import java.awt.*;

/**
 * Created by tkrud on 22.10.2022.
 */
public class JColorChooserExample extends JFrame {
    public static void main(String[] args) {
        JColorChooserExample frame = new JColorChooserExample();

        Color color = JColorChooser.showDialog(frame, "Wybierz kolor", Color.BLUE);
        System.out.println("Wybrany kolor: " + color);

        JLabel label = new JLabel("Label");
        frame.add(label);
        label.setForeground(color);


        frame.setLayout(new FlowLayout());
        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
