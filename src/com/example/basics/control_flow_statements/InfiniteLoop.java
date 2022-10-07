package com.example.basics.control_flow_statements;

/**
 * Created by tkrud on 05.10.2022.
 */
public class InfiniteLoop {
    public static void main(String[] args) {
        while (true){
            int random = (int)Math.round(10 * Math.random());
            System.out.println(random);

            if (random == 10) break;
        }
        for(;;) {
            int random = (int)Math.round(10 * Math.random());
            System.out.println(random);

            if (random == 10) break;
        }


    }
}
