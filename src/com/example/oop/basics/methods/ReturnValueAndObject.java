package com.example.oop.basics.methods;

class Circle {
    float radius;

    Circle(float r) {
        radius = r;
    }
}
class MathMethods {
    public int add (int a, int b) {
        return a + b;
    }


    public int substact(int a, int b) {
        return a - b;
    }

    public Circle getNewCircle(float radius){
        Circle c = new Circle(radius);
        return c;
    }
}
/**
 * Created by tkrud on 12.10.2022.
 */
public class ReturnValueAndObject {
    public static void main(String[] args) {
        MathMethods math = new MathMethods();
        int a = 12;
        int b = 3;
        int result = math.substact(a,b);
        System.out.println("Result: " + result);

        Circle circle = math.getNewCircle(10.0f);
        System.out.println("Radius: " + circle.radius);

    }
}
