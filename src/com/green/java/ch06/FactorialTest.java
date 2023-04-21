package com.green.java.ch06;

public class FactorialTest {
    public static void main(String[] args) {
        int result = factorial(3);
        System.out.printf("result : %d\n", result);
    }

    static int factorial(int n) {
        System.out.println(n);
        if ( n == 1 ) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
