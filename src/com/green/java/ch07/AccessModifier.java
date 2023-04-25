package com.green.java.ch07;
//p.348, 접근 제어자
public class AccessModifier {
    /*
    private, default, protected, public
     */
    public static void main(String[] args) {
        ModifierTest mt1 = new ModifierTest();
        //mt1.num1 = 10;
        mt1.num2 = 20;
        mt1.num3 = 30;
        mt1.num4 = 40;
    }
}

