package com.example.swing;

import javax.swing.*;

/**
 * Created by tkrud on 21.10.2022.
 */
public class JOptionPaneShowConfirmDialog {
    public static void main(String args[]){
        int result = JOptionPane.showConfirmDialog(
                null,
                "Czy zapisac dane?",
                "Dane zmodyfikowane",
                JOptionPane.YES_NO_CANCEL_OPTION
        );
        String str = "";
        switch (result) {
            case JOptionPane.YES_OPTION:
                str = "yes";
                break;
            case JOptionPane.NO_OPTION:
                str = "no";
                break;
            case JOptionPane.CANCEL_OPTION:
                str = "cancel";
                break;
        }
        System.out.println("wybrana opcja: " + str);
    }
}
