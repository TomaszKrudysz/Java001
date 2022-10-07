package com.example.basics.data.string_class;

/**
 * Created by tkrud on 05.10.2022.
 */
public class ContatenationExample {
    public static void main(String[] args) {
        String s1 = "Hello ";
        String s2 = "World";
        String s3 = s1 + s2 + " Jakiś dodatkowy tekst";
        System.out.println(s3);

        String txt1 = "Doge Charger ";
        int year = 2020;
        String car = txt1 + year;
        System.out.println(car);

        String car2 = txt1.concat(Integer.toString(year));
        System.out.println(car2);

        String names [] = {"Ola", "Kasia", "Ela", "Karol"};
        String str = "";

        for (String s : names) {
            str = str.concat(s);
            str += " ";
        }
        System.out.println(str);
    }
}
