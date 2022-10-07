package com.example.basics.operators;

/**
 * Created by tkrud on 03.10.2022.
 */
public class Op4_logicalOperatorAnd {
    public static void main(String[] args) {
        //konunkcja - operator logiczny and

        System.out.println( 5 < 10 && 20 >= 10 ); // true && true wynik true
        System.out.println( 15 < 10 && 20 >= 10 ); // false && true wynik false
        System.out.println( 15 < 10 && 2 >= 10 ); // false && false wynik true


    }
}
