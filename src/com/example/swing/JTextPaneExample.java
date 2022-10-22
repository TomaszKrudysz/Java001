package com.example.swing;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;

/**
 * Created by tkrud on 22.10.2022.
 */
public class JTextPaneExample extends JFrame {
    public static void main(String[] args) throws BadLocationException {
        JTextPaneExample frame = new JTextPaneExample();

        JTextPane textPane = new JTextPane();
        JScrollPane scrollPane = new JScrollPane(textPane);
        textPane.setText("Lorem Ipsum");

        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        StyleConstants.setBold(attributeSet, true);
        StyleConstants.setItalic(attributeSet, true);
        StyleConstants.setForeground(attributeSet, Color.RED);
        StyleConstants.setBackground(attributeSet, Color.lightGray);

        textPane.getDocument().insertString(0, "Hello world" ,attributeSet);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(200  ,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
