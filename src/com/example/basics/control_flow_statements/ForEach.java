package com.example.basics.control_flow_statements;

/**
 * Created by tkrud on 05.10.2022.
 */
public class ForEach {
    public static void main(String[] args) {
        String strArr[] = {"Ola", "Adam", "Kasia", "Olek"};

        for (String str : strArr) {
            if(str.equalsIgnoreCase("Kasia")) continue;
            System.out.println(str);
        }
    }
}
