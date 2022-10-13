package com.example.oop.basics;
class PlainWithStatic {
    static int nextId = 1; //to pole jest współdzielone przez wszystkie obiekty

    int id;
    int x,y;

    static int getNextId() {
        return nextId++;
    }

    PlainWithStatic() {
        id = getNextId();

    }
}
/**
 * Created by tkrud on 13.10.2022.
 */
public class StaticExample {
    public static void main(String[] args) {
        PlainWithStatic plain1 = new PlainWithStatic();
        PlainWithStatic plain2 = new PlainWithStatic();
        PlainWithStatic plain3 = new PlainWithStatic();
/*
        System.out.println("plain1: " + plain1.nextId); //niezalecane odwoływanie się do pola statycznego przez obiekt!!
        plain1.nextId = 7;
        System.out.println("plain1: " + plain1.nextId);
        System.out.println("plain2: " + plain2.nextId);
        System.out.println("PlainWithStatic: " + PlainWithStatic.nextId); //to jest zalecana metoda odwoływanie się
        // do pola statycznego
*/
        System.out.println("plain1.id: " + plain1.id);
        System.out.println("plain2.id: " + plain2.id);
        System.out.println("plain3.id: " + plain3.id);
    }
}
