package com.example.swing;

import javax.swing.*;

/**
 * Created by tkrud on 21.10.2022.
 */
public class JoptionPaneShowOptionDialogExample {
    public static void main(String[] args) {
        String options[] = {"Save","Load latest","Compile","Abort"};
        int result = JOptionPane.showOptionDialog(
                null,
                "What to do:",
                "Title",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]

                );
        System.out.println("Wybrano: " + options[result]);

        JTextArea area = new JTextArea(8,16);
        JTextField email = new JTextField(10);
        Object options2[] = {
          new JLabel("Email"),
          email,
                "Send",
                "Cancel"

        };

        int result2 = JOptionPane.showOptionDialog(
                null,
                area,
                "Send email",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options2,
                options2[3]

        );

        System.out.println("tekst area: " + area.getText());
        System.out.println("email: " + email.getText());
        System.out.println("result 2: " + result2);
    }
}
