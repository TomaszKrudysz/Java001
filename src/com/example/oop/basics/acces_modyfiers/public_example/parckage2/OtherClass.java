package com.example.oop.basics.acces_modyfiers.public_example.parckage2;

import com.example.oop.basics.acces_modyfiers.public_example.package1.BasicClass;

/**
 * Created by tkrud on 16.10.2022.
 */
public class OtherClass extends BasicClass {
    public OtherClass() {
        name = "OtherClass";
        this.setName("OtherClass");
    }
}
