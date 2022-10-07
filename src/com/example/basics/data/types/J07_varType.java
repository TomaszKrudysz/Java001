package com.example.basics.data.types;

/**
 * Created by tkrud on 01.10.2022.
 */
public class J07_varType {
    public static void main(String[] args) {
    int number = add(10, "5");
        System.out.println(number);
    }

    public static int add(int a, String b){
        var result = a + Integer.valueOf(b).intValue();
        return result;
    }
}
