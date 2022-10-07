package com.example.basics.control_flow_statements;

/**
 * Created by tkrud on 05.10.2022.
 */
public class ForLoop {
    public static void main(String[] args) {
        int arr[] = {1, 5, 10, 15};

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            System.out.println("arr: " + value);

        }
    //ODWROTNY KIERUNEK
        String names[] = {"Ola", "Ania", "Kasia"};

        for (int i = names.length - 1; i >= 0; i--) {
            String value = names[i];
            System.out.println(value);
        }
    }
}
