package com.example.swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by tkrud on 21.10.2022.
 */
public class JListExample extends JFrame{
    public static void main(String[] args) {
        JListExample frame = new JListExample();

        DefaultListModel<String> df = new DefaultListModel<>();
        df.addElement("Java");
        df.addElement("C++");
        df.addElement("Python");
        df.addElement("JavaScript");

        JList<String> list = new JList<>(df);

        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()) return;
                int indices[] = list.getSelectedIndices();
                Arrays.stream(indices).forEach(i -> System.out.println(list.getModel().getElementAt(i)));
            }
        });

        frame.add(list);

        frame.setLayout(new FlowLayout());
        frame.setSize(640,480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}
