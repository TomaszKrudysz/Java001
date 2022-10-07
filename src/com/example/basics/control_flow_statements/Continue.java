package com.example.basics.control_flow_statements;

/**
 * Created by tkrud on 05.10.2022.
 */
public class Continue {
    public static void main(String[] args) {

    for(int a = 0; a <= 5; a++){

        if (a == 3) {

            continue;
        }

        System.out.println(a);
    }

    }
}
