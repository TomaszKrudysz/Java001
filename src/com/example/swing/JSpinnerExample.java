package com.example.swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Created by tkrud on 22.10.2022.
 */
public class JSpinnerExample extends JFrame {
    public static void main(String[] args) {
        JSpinnerExample frame = new JSpinnerExample();

        SpinnerNumberModel spinnerNumberModel = new SpinnerNumberModel(10, -5, 15, 1);

        JSpinner spinner = new JSpinner(spinnerNumberModel);
        spinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("Spinner: " + spinner.getValue());
            }
        });
        frame.add(spinner);

        frame.setLayout(new FlowLayout());
        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
