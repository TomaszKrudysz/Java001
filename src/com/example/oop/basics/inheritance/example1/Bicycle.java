package com.example.oop.basics.inheritance.example1;

/**
 * Created by tkrud on 16.10.2022.
 */
public class Bicycle extends Vehicle{
    Bicycle() {
        //super() - dodane automatycznie
        type = "Bicycle";
        manufacturer = "Romet";
        topSpeed = 15.0f;
    }
}
