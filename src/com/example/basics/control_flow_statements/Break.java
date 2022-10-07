package com.example.basics.control_flow_statements;

/**
 * Created by tkrud on 05.10.2022.
 */
public class Break {
    public static void main(String[] args) {
        int a = 10;
        while (a > 0) {
            System.out.println(a);
            a--;

            if(a==2) break;;
        }
    }
}
