package com.green.java.ch03;

public class OperatorEx18 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1_000) / 1_000.0;
        System.out.println(shortPi);

        System.out.println(Math.round(315.4)); //315
        System.out.println(Math.round(315.5)); //316
        System.out.println(Math.ceil(315.01)); //316.0
        System.out.println(Math.floor(315.999999)); //315.0

    }
}
