package com.green.java.ch02;

public class StringStudy1 {
    public static void main(String[] args) {
        String str = "abcdefghijklmn";

        String r1 = str.substring(0, 4);
        System.out.println(str);
        System.out.println(r1);

        String r2 = str.substring(3, 6);
        System.out.println(r2);

        String r3 = str.substring(5);
        System.out.println("r3 : " + r3);

        int idx = str.indexOf("g");
        System.out.println("idx : " + idx);

        int len = str.length();
        System.out.println("len : " + len);

        char[] charArr = str.toCharArray();
        System.out.println(charArr[0]);
        System.out.println(charArr[1]);
        charArr[0] = '!';
        System.out.println(str);
    }
}
