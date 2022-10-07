package com.example.basics.programs;

import java.util.Scanner;

/**
 * Created by tkrud on 05.10.2022.
 */
public class BasicScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj swoje imię:");
        String name = in.nextLine();
        System.out.println("Twoje imię to: " + name);
    }
}
