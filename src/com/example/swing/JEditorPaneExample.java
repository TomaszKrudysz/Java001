package com.example.swing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

/**
 * Created by tkrud on 22.10.2022.
 */
public class JEditorPaneExample extends JFrame {
    public static void main(String[] args) {
        JEditorPaneExample frame = new JEditorPaneExample();

        JEditorPane editor = new JEditorPane(
                "text/html",
                "<html><h1>Title</h1><p>Lorem ipsum</p></html>"
        );

        editor.setVisible(true);
        editor.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("insert update");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("remove update" + editor.getText());

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        JScrollPane scrollPane = new JScrollPane(editor);

        frame.add(scrollPane,BorderLayout.CENTER);

        frame.setSize(600  ,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
