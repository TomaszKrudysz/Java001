package com.example.oop.basics.acces_modyfiers.protected_example;

import com.example.oop.basics.acces_modyfiers.protected_example.Package2.Computer;
import com.example.oop.basics.acces_modyfiers.protected_example.package1.Laptop;

/**
 * Created by tkrud on 16.10.2022.
 */
public class ProtectedExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setName("DELL");
        System.out.println(computer.getName());

        Laptop laptop = new Laptop();
        System.out.println(laptop.getName());
    }
}
