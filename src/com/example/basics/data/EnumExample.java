package com.example.basics.data;

/**
 * Created by tkrud on 01.10.2022.
 */
public class EnumExample {

    enum soundVolume {LOW, MEDIUM, HIGH, VERY_HIGH};
    enum carVariant {SEDAN, COMBI, SUPER_CAR};

    public static void main(String[] args) {
        soundVolume phoneSound = soundVolume.LOW;
        System.out.println(phoneSound);
     }
}
