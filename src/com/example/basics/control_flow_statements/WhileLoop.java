package com.example.basics.control_flow_statements;

/**
 * Created by tkrud on 05.10.2022.
 */
public class WhileLoop {
    public static void main(String[] args) {
        int i = 5;

        while (i>0) {
            System.out.println(i);
            i--;
        }

        i = 0;
        while (i<6) {
            System.out.println(i);
            i++;
        }
    }
}
