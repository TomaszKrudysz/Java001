package com.example.basics.data.types;

/**
 * Created by tkrud on 01.10.2022.
 */
public class J10_arrays {
    public static void main(String[] args) {
        int numArr[] = new int[10];
        numArr[1] = 7;
        System.out.println("numArr[1]: " + numArr[1] + "\n"  +  "numArr.length: " + numArr.length);

        float floatArr[] = new float[5];
        floatArr[0] = 1.0f;
        float floatArr2[] = {10.1f, 11.1f, 12.2f, 78.0f};
        System.out.println("floatArr[0]: " + floatArr[0]);
        System.out.println("floatArr2[0]" + floatArr2[0]);
        System.out.println("floatArr2[1]" + floatArr2[1]);
        System.out.println("floatArr2[2]" + floatArr2[2]);
        System.out.println("floatArr2[3]" + floatArr2[3]);

        String strArr[] = new String[7];
        System.out.println("strArr[1]: " + strArr[1]);

        String namesArr[] = {"Ola", "Ania", "Karol"};
        System.out.println("namesArr[0]:" + namesArr[0]);

    }
}
