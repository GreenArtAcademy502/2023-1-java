package com.green.java.ch02;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20, temp = 0;

        System.out.printf("x: %d, y: %d \n", x, y);

        temp = x;
        x = y;
        y = temp;

        System.out.printf("x: %d, y: %d \n", x, y);
    }
}
