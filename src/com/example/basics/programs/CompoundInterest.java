package com.example.basics.programs;

import java.util.Scanner;
//Procent składany
//1000 * (1 + 0.05)^3
/**
 * Created by tkrud on 05.10.2022.
 */
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double startCapital = 0;
        double yearlyIntrest = 0;
        int numYears = 0;

        double finalCapital; //rezultat oszczędzania

        System.out.println("Wpisz kapitał początkowy:");
        startCapital = Double.valueOf(in.nextLine()).doubleValue();
        System.out.println(startCapital);

        System.out.println("oprocentowanie:");
        yearlyIntrest = Double.valueOf(in.nextLine()).doubleValue();
        System.out.println(yearlyIntrest);

        System.out.println("ile lat:");
        numYears = Integer.valueOf(in.nextLine()).intValue();
        System.out.println(numYears);

        finalCapital = startCapital * Math.pow(1 + (yearlyIntrest / 100.0d ), numYears);
        System.out.println("Efekt oszczedzania: " + Math.round(finalCapital));
    }
}
