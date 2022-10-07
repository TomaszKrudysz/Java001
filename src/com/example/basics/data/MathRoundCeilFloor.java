package com.example.basics.data;

/**
 * Created by tkrud on 03.10.2022.
 */
public class MathRoundCeilFloor {
    public static void main(String[] args) {
        //zaokraglenie do najbliżeszej liczby całkowitej
        System.out.println(Math.round(5.51));
        System.out.println(Math.round(5.49));

        //rzutowanie, utrata czesci ułamkowej
        System.out.println((int) 5.45d);

        //Math.cail() - najwiękrza możliwa całkowita liczba
        System.out.println(Math.ceil(6.11));
        System.out.println(Math.ceil(6.81));

        //Math.floor() - najmniejsza możliwa liczba całkowita
        System.out.println(Math.floor(6.11));
        System.out.println(Math.floor(6.81));

    }
}
