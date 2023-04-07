package com.green.java.ch02;

public class VariableFloat {
    public static void main(String[] args) {
        //double(8byte), float(4byte)
        float f1 = 10;
        System.out.println(f1);

        f1 = (float)9.77;
        f1 = 9.777f;
        f1 = 9.77F;
        System.out.println(f1);

        long l1 = 100;
        float f2 = l1; //자동형변환, float 4byte, long 8byte
        System.out.println(f2);

        double d1 = 9.77d;
        double d2 = 9.77D;
    }
}

