package com.green.java.ch06;

import java.io.PrintStream;

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

        PrintStream ps = System.out;
        //System.out = null;
        ps.println("result2 : " + result);
    }
}
