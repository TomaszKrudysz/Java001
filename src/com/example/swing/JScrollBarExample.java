package com.example.swing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

/**
 * Created by tkrud on 21.10.2022.
 */
public class JScrollBarExample extends JFrame{
    public static void main(String[] args) {
        JScrollBarExample frame = new JScrollBarExample();

        JScrollBar scroll1 = new JScrollBar(Adjustable.HORIZONTAL);
        scroll1.setValue(0);
        scroll1.setMinimum(0);
        scroll1.setMaximum(100);
        scroll1.setPreferredSize(new Dimension(180,30));

        scroll1.addAdjustmentListener(
                new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                if (e.getValueIsAdjusting()) return;
                System.out.println("scroll value: " + e.getValue());
            }
        }
        );

        frame.add(scroll1);

        frame.setLayout(new FlowLayout());
        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
