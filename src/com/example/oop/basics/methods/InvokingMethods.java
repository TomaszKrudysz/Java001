package com.example.oop.basics.methods;
class Triangle {
    float a; //dlugosc podstawy
    float h; //wysokosc trojkata
}

class MyMath {
    public void add(int a, int b){
        a = 20;
        int result = a + b;
        System.out.println("resoult: " + result);
    }
}
/**
 * Created by tkrud on 07.10.2022.
 */
public class InvokingMethods {
    public static void main(String[] args) {
        MyMath math = new MyMath();
        int a = 10;
        int b = 7;
        math.add(a,b);
        System.out.println(a);
    }
}
