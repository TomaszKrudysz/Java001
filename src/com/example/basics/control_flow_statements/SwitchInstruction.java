package com.example.basics.control_flow_statements;

/**
 * Created by tkrud on 05.10.2022.
 */
public class SwitchInstruction {
    public static void main(String[] args) {
        int num = 11;
        switch (num) {
            case 1:
                System.out.println(1);
                break;
            case 3:
                System.out.println(3);
                break;
            case 10:
                System.out.println(10 + " haha");
                break;
            default:
                System.out.println("nic nie pasuje");
        }

        String str = "ania";
        switch (str) {
            case "Ola":
                System.out.println("ola");
                break;
            case "Ania":
                System.out.println("poszła Ania");
                break;
            default:
                System.out.println("nic nie weszlo");
        }
    }
}
