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
        System.out.println("----");
        int result = mm.sum2(10, 245);
        System.out.println("result : " + result);
        System.out.println("result : " + mm.sum2(10, 245));

        String str = " a_b_다_라_마바  ";
        String r1 = str.trim().replace("_", "*").toUpperCase();
        System.out.println(r1);

        "a_b_다_라_마바".replace("_", "*");
        String r2 = "a*b*다*라*마바".toUpperCase(); //"A*B*다*라*마바"
        System.out.println(r2);

        PrintStream ps = System.out;
        //System.out = null;
        ps.println("result2 : " + result);
    }
}

class NumberBox2 {
    static int num;
}
