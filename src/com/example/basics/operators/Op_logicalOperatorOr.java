package com.example.basics.operators;

/**
 * Created by tkrud on 03.10.2022.
 */
public class Op_logicalOperatorOr {
    public static void main(String[] args) {
        //operator logiczny alternatywa, inaczej lub, or
        //true || true wynik true
        //true || false wynik true
        //false || false wynik false


        System.out.println(10 > 2 || 5 >= 1);
        System.out.println(10 > 8 || 1 == 10);
        System.out.println(2 > 4 || 5 != 5);
    }
}
