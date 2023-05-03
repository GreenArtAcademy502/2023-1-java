package com.green.java.ch06;

public class ObjectPrint {
    public static void main(String[] args) {
        String str = new String("ABC");
        System.out.println(str);

        ValueBox vb = new ValueBox();
        vb.num = 15;
        System.out.println(vb + "안녕");

    }
}

class ValueBox {
    int num;
    @Override
    public String toString() {
        return String.valueOf(num);
    }

}