package com.example.swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by tkrud on 21.10.2022.
 */
public class JOptionPaneShowMessageDialog extends JFrame {
    public static void main(String[] args) {
        JOptionPaneShowMessageDialog frame = new JOptionPaneShowMessageDialog();

        //JOptionPane.showMessageDialog(frame, "Hello World", "Title", JOptionPane.PLAIN_MESSAGE);

        ImageIcon icon = new ImageIcon("files//parrot.jpg");

        JOptionPane.showMessageDialog(null,"<html><u>Hello World</u></html>","Title",JOptionPane.ERROR_MESSAGE,icon);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
       // frame.setVisible(true);


    }
}
