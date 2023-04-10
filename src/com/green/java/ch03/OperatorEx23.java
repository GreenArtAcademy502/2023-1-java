package com.green.java.ch03;

public class OperatorEx23 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = new String("abc");
        System.out.printf("\"abc\" == \"abc\" ? %b\n", "abc" == "abc");
        System.out.println("abc".equals("abc"));
        System.out.printf("s1 == s2 ? %b\n", s1 == s2);
        System.out.printf("s2 == s3 ? %b\n", s2 == s3);
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s3));

        String s4 = new String("aBc");
        System.out.println("s1.equals(s4) : " + s1.equals(s4));
        System.out.println("s1.equalsIgnoreCase(s4) : " + s1.equalsIgnoreCase(s4));
    }
}
