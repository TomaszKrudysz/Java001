package com.example.oop.basics.inheritance.super_example;

/**
 * Created by tkrud on 16.10.2022.
 */
public final class Director extends Person{
    private int officeNumber;

    public Director(String name, String surname, int officeNumber) {
        super(name, surname);
        this.officeNumber = officeNumber;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }
}
