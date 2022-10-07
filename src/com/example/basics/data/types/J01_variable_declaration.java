package com.example.basics.data.types;

/**
 * Created by tkrud on 01.10.2022.
 */
public class J01_variable_declaration {

    public static void main(String args[]) {
        int number = 24;
        number = 98;

        System.out.println("wartosc zmiennej number " + number);

        int data = -123;
        System.out.println("data: " + data);

        number = data * 2;
        System.out.println("number: " + number);
    }
}
