package com.green.java.ch03;

public class OperatorEx32Quiz1 {
    public int getAbs(int n) {
        if(n >= 0) {
            return n;
        }
        return -n;
        // return n >= 0 ? n : -n;
    }

    public static void main(String[] args) {
        int x = 12, y = -8, z = 0;
        int absX, absY, absZ;

        OperatorEx32Quiz1 oEx32 = new OperatorEx32Quiz1();
        absX = oEx32.getAbs(x);
        absY = oEx32.getAbs(y);
        absZ = oEx32.getAbs(z);

        System.out.println("absX : " + absX);
        System.out.println("absY : " + absY);
        System.out.println("absZ : " + absZ);
    }
}
