package com.example.oop.basics.inheritance.super_example;

/**
 * Created by tkrud on 16.10.2022.
 */
public class SuperTest {
    public static void main(String[] args) {
        Student student = new Student("Ania","Kowalska",5);
        Teacher teacher = new Teacher("Adam","Dobrzymski", "biology");
        System.out.println(teacher.getTeachingSubject());
        Director director = new Director("Anna", "Zabłocka", 10);


    }
}
