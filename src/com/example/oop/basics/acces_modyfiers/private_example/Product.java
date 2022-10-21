package com.example.oop.basics.acces_modyfiers.private_example;

/**
 * Created by tkrud on 16.10.2022.
 */
public class Product {

    private String name;

    public Product() {
        this.name = "unknown";
    }

    public Product(String name) {
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
