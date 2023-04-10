package com.green.java.ch02;

public class CastingEx2 {
    //10을 3으로 나눠서 소수점이 나타나도록 해주세요.
    //3.0이 나오지 않도록 해주세요.
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;

        char c = 'A';
        int n3 = c;

        double r = (double)n1 / n2;
        System.out.printf("%.4f\n", r);

    }
}
