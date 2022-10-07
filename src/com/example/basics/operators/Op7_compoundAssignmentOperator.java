package com.example.basics.operators;

/**
 * Created by tkrud on 03.10.2022.
 */
public class Op7_compoundAssignmentOperator {
    public static void main(String[] args) {
        //złożone operatory przypiasnia
        // += -= *= /= %=
        int a = 5;
        a += 10;
        System.out.println(a);

        int b = 2;
        b *=3;
        System.out.println(b);

        int c = 20;
        c %=3;
        System.out.println(c);
    }
}
