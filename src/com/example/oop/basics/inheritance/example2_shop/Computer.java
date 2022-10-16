package com.example.oop.basics.inheritance.example2_shop;

/**
 * Created by tkrud on 16.10.2022.
 */
public class Computer extends Product{
    public Mouse mouse;
    public Keyboard keyboard;
    public Monitor monitor;

    Computer() {
        mouse = new Mouse();
        keyboard = new Keyboard();
        monitor = new Monitor();

        prise = 1000.0f;
    }
}
