package com.example.swing;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.File;

/**
 * Created by tkrud on 22.10.2022.
 */
public class JFileChooserExample extends JFrame {
    public static void main(String[] args) {
        JFileChooserExample frame = new JFileChooserExample();

        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Files", "mp4", "dat", "jpg");
        fileChooser.addChoosableFileFilter(filter);

        int res = fileChooser.showOpenDialog(null);

        switch (res) {
            case JFileChooser.APPROVE_OPTION:
                File file = fileChooser.getSelectedFile();
                System.out.println(file.getAbsolutePath());
                break;
            case JFileChooser.CANCEL_OPTION:
                System.out.println("JFileChooser cancel");
                break;
            case JFileChooser.ERROR_OPTION:
                System.out.println("JFileChooser error");
                break;

        }



        frame.setLayout(new FlowLayout());
        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
