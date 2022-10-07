package com.example.basics.control_flow_statements;

/**
 * Created by tkrud on 05.10.2022.
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        int a = 0;
        do {
            System.out.println(a*2);
            a++;
        }while (a<10);
    //petla do while sprawdzająca czy liczba w zakresie od 0 do 20 jest parzysta

    int j = 0;
    do {
        if (j % 2 != 0) System.out.println("liczba " + j + " jest nieparzysta");
        j++;

    }while (j<=20);
    }


}
