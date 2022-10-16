package com.example.oop.basics.acces_modyfiers.public_example;

import com.example.oop.basics.acces_modyfiers.public_example.package1.BasicClass;
import com.example.oop.basics.acces_modyfiers.public_example.parckage2.OtherClass;

/**
 * Created by tkrud on 16.10.2022.
 */
public class Test {
    public static void main(String[] args) {
        BasicClass basicClass = new BasicClass();
        basicClass.name = "basic";
        OtherClass otherClass = new OtherClass();
        otherClass.setName("otherClass");
    }
}
