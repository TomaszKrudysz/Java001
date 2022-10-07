package com.example.basics.data;

import java.math.*;


/**
 * Created by tkrud on 02.10.2022.
 */
public class BigIntegerBigDecimal {
    public static void main(String[] args) {
        BigInteger bigInt = new BigInteger("53456546546567657657");
        bigInt = bigInt.add(new BigInteger("45232323232323232323232655662"));
        System.out.println(bigInt);

        BigDecimal decimal = new BigDecimal("555451511551.555555522");
        decimal = decimal.pow(3);
        System.out.println(decimal);

    }
}