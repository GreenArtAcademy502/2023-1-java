package com.green.java.ch03;

public class OperatorEx3 {
    public static void main(String[] args) {
        int i=5, z=5;
        System.out.println(i++);
        System.out.println(++z);
        System.out.printf("i=%d, j=%d\n", i, z);

        int k = 5;
        int r = k++ - ++k;
        System.out.println(r); //0
        //
    }
}
