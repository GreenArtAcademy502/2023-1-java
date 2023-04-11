package com.green.java.ch03;

public class OperatorEx26 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        System.out.println(a != 0 || ++b != 0);
        System.out.println(a == 0 && ++b != 0);
        System.out.println(a == 5 && ++b != 0);
        System.out.println(a == 5 && b++ != 0);
    }
}
