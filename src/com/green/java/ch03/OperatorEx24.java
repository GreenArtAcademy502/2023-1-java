package com.green.java.ch03;

public class OperatorEx24 {
    public static void main(String[] args) {
        // && and 연산자
        // || or 연산자
        // (2 > 1) && (3 > 2)
        // (2 > 1) && (3 > 2) && (3 >= 5)

        // (2 > 1) || (3 > 2) || (3 >= 5)

        boolean r1 = (2 > 1) && (3 > 2);
        System.out.printf("r1 : %b\n", r1);

        boolean r2 = (2 > 1) && (3 > 2) && (3 >= 5);
        System.out.printf("r2 : %b\n", r2);

        boolean r3 = (2 > 1) || (3 > 2) || (3 >= 5);
        System.out.printf("r3 : %b\n", r3);
    }
}
