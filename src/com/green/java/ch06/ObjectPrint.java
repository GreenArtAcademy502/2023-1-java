package com.green.java.ch06;

public class ObjectPrint {
    public static void main(String[] args) {
        String str = new String("ABC");
        System.out.println(str);

        ValueBox vb = new ValueBox();
        vb.num = 12;
        System.out.println(vb);

    }
}

class ValueBox {
    int num;

    @Override
    public String toString() {
        return String.valueOf(num);
    }
}