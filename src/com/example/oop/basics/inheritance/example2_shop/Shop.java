package com.example.oop.basics.inheritance.example2_shop;
/*
klasa shop
klasa Product (zmienne: price, name, manufactrurer, productionYear)
    klasa Mouse extends Product (zmienne: numButtons = 3)
        klasa VerticalMouse extends Mouse (zmienne: -)
    klasa Monitor extends Product (zmianne: resolution = 1080)
    klasa Keyboard extends Product (zmienne: numKeys = 104)
    klasa Computer extends Product (zmiennne: mouse, monitor, keyboard)

    dodajemy pusty konstruktor do każdej klasy, ustawiamy dla nich pola danej klasy
    tworzymy egzemplarze klas w metodzie main
    Każda klasa w oddzielnym pliku
 */



/**
 * Created by tkrud on 16.10.2022.
 */
public class Shop {
    public static void main(String[] args){
        Product product = new Product();
        Mouse mouse = new Mouse();
        VerticalMouse verticalMouse = new VerticalMouse();
        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();
        Computer computer = new Computer();
        System.out.println(computer.monitor.resolution);
        System.out.println("keyboard prise: " + keyboard.prise);
        System.out.println("komputer price: " + computer.prise);
        System.out.println("monitor price: " + monitor.prise);
    }
}
