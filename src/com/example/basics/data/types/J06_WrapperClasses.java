package com.example.basics.data.types;

/**
 * Created by tkrud on 01.10.2022.
 */
public class J06_WrapperClasses {
    public static void main(String[] args) {
        int a = 123;
        Integer number = Integer.valueOf(a);
        System.out.println(number.toString());
        System.out.println(number.floatValue());
        System.out.println(Integer.toHexString(a));
    }
}
