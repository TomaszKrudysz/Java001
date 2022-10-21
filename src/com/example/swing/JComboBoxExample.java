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
public class JComboBoxExample extends JFrame {
    public static void main(String[] args) {
        JComboBoxExample frame = new JComboBoxExample();

        String prog[] = {"Java" , "JavaScript", "C++", "C#", "Python", " PHP" };
        JComboBox<String> cb = new JComboBox<>(prog);
        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("selected: " + prog[cb.getSelectedIndex()]);
            }
        });

        cb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int state = e.getStateChange();
                if(state == ItemEvent.SELECTED) {
                    System.out.println(e.getItem() + " selected");
                }else if(state == ItemEvent.DESELECTED){
                    System.out.println(e.getItem() + " deselected");
                }
            }
        });

        frame.add(cb);

        frame.setLayout(new FlowLayout());
        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
