package com.example.oop.basics.inheritance.example1;

/**
 * Created by tkrud on 16.10.2022.
 */
public class SuperCar extends Car{
    SuperCar() {
        type = "SuperCar";
        topSpeed = 300.0f;
    }

    public void setSportMode() {
        System.out.println("Sport mode activated");
    }
}
