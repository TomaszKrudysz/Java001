package com.example.basics.data.types;

import java.util.Locale;

/**
 * Created by tkrud on 01.10.2022.
 */
public class J09_string {
    public static void main(String[] args) {
        String s1 = "String #1";
        String s2 = new String("Strong #2");

        String s3 = s1 + s2;
        System.out.println(s3.toUpperCase() +" " + s3.length());

        String s4 = "wiersz # \n \t wiersz #2 \n \\ \u263A ";
        System.out.println(s4);


    }
}
