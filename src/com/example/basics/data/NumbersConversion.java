package com.example.basics.data;

/**
 * Created by tkrud on 02.10.2022.
 */
public class NumbersConversion {
    public static void main(String[] args) {
        //konwersja jawna
        int i =5;
        double d = 20.0d / (double) i;
        System.out.println(d);

        //konwersja niejawna- rozszerzająca
        int a = 4;
        double b = 10.0d * a;
        System.out.println(b);

        double d2 = 5.5d;
        int num = 10 * (int)d2;
        System.out.println(num);
        //przy konwersji double na int część ułamkowa jest tracona.

        byte small = (byte)200;


    }

    }

