package com.green.java.ch03;

public class OperatorEx16 {
    public static void main(String[] args) {
        float pi = 3.141592f;
        float shortPi = (int)(pi * 1_000) / 1000f;
        System.out.println(pi);
        System.out.println(shortPi);
    }
}
