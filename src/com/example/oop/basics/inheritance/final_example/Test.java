package com.example.oop.basics.inheritance.final_example;
class Employee {
    String name;
    String surname;
    String jobTitle;
    float salary;
}
class Manager extends Employee {
    String responsibility;
}
class Director extends Manager {
    String department;
}
class VicePresident extends Director{

}
final class CEO extends VicePresident {
    String companyName;
}
//class SSSSS extends CEO{ } nie można rozszerzyć klasy final
/**
 * Created by tkrud on 16.10.2022.
 */
public class Test {
    public static void main(String[] args) {
        CEO ceo = new CEO();
    }
}
