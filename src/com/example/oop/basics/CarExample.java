package com.example.oop.basics;

/**
 * Created by tkrud on 06.10.2022.
 */

class Car {
    String manufacturer;
    String name;
    int year;
    String color;
    float topSpeed;

    public void printInfo() {
        System.out.println(this.manufacturer + " " + this.name + " " + this.year);
    }
}

public class CarExample {
    public static void main(String[] args) {

        Car ford = new Car();
        ford.manufacturer = "Ford";
        ford.name = "Mustang";
        ford.color = "blue";
        ford.year = 1967;
        ford.topSpeed = 200.0f;
        ford.printInfo();

        Car chevrolet = new Car();
        chevrolet.manufacturer = "Chevrolet";
        chevrolet.name = "Camaro";
        chevrolet.color = "red";
        chevrolet.year = 2020;
        chevrolet.topSpeed = 300.0f;
        chevrolet.printInfo();


    }
}
