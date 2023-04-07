package com.green.java.ch02;

public class VariableTest {
    public static void main(String[] args) {
        String r1 = "안녕" + 1 + 1;
        // String r1 = "안녕1" + 1;
        // String r1 = "안녕11";
        System.out.println(r1);

        String r2 = "안녕" + (1 + 1);
        System.out.println(r2);

        String r3 = 1 + 1 + "안녕";
        System.out.println(r3);
    }
}
