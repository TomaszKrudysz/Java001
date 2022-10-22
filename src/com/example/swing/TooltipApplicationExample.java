package com.example.swing;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;

/**
 * Created by tkrud on 22.10.2022.
 */
public class TooltipApplicationExample  {
    public static void main(String[] args)  {
        JFrame frame = new JFrame();

        JButton b1 = new JButton("Click my");
        b1.setToolTipText("Kliknij mnie");

        frame.setLayout(new FlowLayout());
        frame.add(b1);

        Image icon = (new ImageIcon("files\\parrot.jpg")).getImage();
        frame.setIconImage(icon);

        frame.setSize(200  ,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
