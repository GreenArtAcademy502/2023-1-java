package com.green.java.ch01;

public class DateTest {
    public static void main(String[] args) {
        int y = 2023, m = 5, d = 27;
        String strDate = String.format("%d-%02d-%02d", y, m, d);
        System.out.println(strDate); //"2023-05-27"

        m = 12;
        d = 5;

        strDate = String.format("%d-%02d-%02d", y, m, d);
        System.out.println(strDate); //"2023-12-05"

    }
}
