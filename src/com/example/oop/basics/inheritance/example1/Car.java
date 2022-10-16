package com.example.oop.basics.inheritance.example1;

/**
 * Created by tkrud on 16.10.2022.
 */
public class Car extends Vehicle {
    Car() {
        this.type = "Car";
        this.manufacturer = "Ford";
        this.topSpeed = 200.0f;
    }
    Car(String manufacturer, float topSpeed) {
        this(); // wywołuje domyślny konstruktor z wartościami Car, Ford, 200.0f a nastepnie nadpisuje pola na te w
        // podane w argumentach nowowywołąnego konstruktora.
        this.manufacturer = manufacturer;
        this.topSpeed = topSpeed;
    }

}
