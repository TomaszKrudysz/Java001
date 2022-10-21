package com.example.swing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tkrud on 19.10.2022.
 */
public class JTextAreaExample extends JFrame{
    public static void main(String[] args) {
        JTextAreaExample frame = new JTextAreaExample();

        JTextArea t = new JTextArea(10,14);
        JScrollPane pane = new JScrollPane(t);

        t.append("Lorem ipsum");
        t.append("And other text");
        t.insert("Hello world", 0);
        t.setLineWrap(true);

        t.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("insertUpdate: " + t.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("removeUpdate: " + t.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                System.out.println("changeUpdate" + t.getText());
            }
        });


        frame.add(pane);

        frame.setLayout(new FlowLayout());
        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
