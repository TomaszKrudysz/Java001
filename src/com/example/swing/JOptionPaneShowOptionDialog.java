package com.example.swing;

import javax.swing.*;

/**
 * Created by tkrud on 21.10.2022.
 */
public class JOptionPaneShowOptionDialog {
    public static void main(String[] args) {
       /* String result = JOptionPane.showInputDialog(
                null,
                "Wpisz swoje imię:"
        );
        System.out.println("Imię: " + result);*/

        String cars[] = {"Ford","Merc" ,"Doge"};
        String result2 = (String) JOptionPane.showInputDialog(
                null,
                null,
                "Wybierz samochód",
                JOptionPane.QUESTION_MESSAGE,
                null,
                cars,
                cars[0]
        );
        System.out.println("Wybrane auto: " + result2);
    }
}