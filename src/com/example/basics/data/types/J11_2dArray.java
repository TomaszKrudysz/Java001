package com.example.basics.data.types;

/**
 * Created by tkrud on 01.10.2022.
 */
public class J11_2dArray {
    public static void main(String[] args) {
        String strArr[][] =  { //[2][4]
                {"1","2","3","a"},
                {"4","5","6","b"}
        };
        System.out.println(strArr[0][1]);

        System.out.println(strArr[1][3]);

        int numArr[][] =new int[3][4];
        numArr[1][2] = 110;

        System.out.println(numArr[1][2]);

        int numRows = 10;
        int numCols = 15;
        int arr[][] = new int[numRows][numCols];


    }
}
