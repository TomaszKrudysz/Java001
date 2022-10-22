package com.example.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by tkrud on 22.10.2022.
 */
public class JSplitPaneExample extends JFrame {
    public static void main(String[] args) {
        JSplitPaneExample frame = new JSplitPaneExample();

        JPanel panel1 = new JPanel();
        String cars[] = {"Ford", "Doge", "Pontiac"};
        panel1.add(new JComboBox<String>(cars));

        JPanel panel2 = new JPanel();
        String bikes[] = {"Honda", "BMW"};
        panel2.add(new JComboBox<String>(bikes));

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                panel1,panel2);

        frame.add(splitPane, BorderLayout.CENTER);

        frame.setSize(200  ,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
