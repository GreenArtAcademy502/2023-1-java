package com.green.java.ch06;

public class MyMethodTest {
    public static void main(String[] args) {
        MyMethod mm = new MyMethod();
        mm.sum(10, 20);
        mm.sum(10, 22);
        mm.sum(10, 223);
        mm.sum(10, 245);
        mm.sum(20, 11);

        int result = mm.sum2(10, 245);
        System.out.println("result : " + result);
    }
}
