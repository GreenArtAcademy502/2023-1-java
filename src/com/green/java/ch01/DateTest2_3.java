package com.green.java.ch01;

public class DateTest2_3 {
    public static void main(String[] args) {
        int y = 2023, m = 2, d = 15;
        System.out.printf("%s-%s-%s", y, convertTwoNumber(m), convertTwoNumber(d));
    }

    public static String convertTwoNumber(int n) {
        return (n < 10 ? "0" : "") + n;
    }
}
