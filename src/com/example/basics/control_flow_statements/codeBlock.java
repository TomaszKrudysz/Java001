package com.example.basics.control_flow_statements;

/**
 * Created by tkrud on 03.10.2022.
 */
public class codeBlock {
    public static void main(String[] args) {

        if (5 > 10) {
            int a = 5;
            System.out.println("a: " + a);
            }
//        else {
//            System.out.println(a);
//        }

        int b = 12;
        {
            System.out.println(b);
        }
// deklaracja zmiennej za blokiem kodu powoduje błąłd.
//        {
//            System.out.println(c);
//        }
//        int c = 13;
    }
}
