package com.green.java.ch14;

public class MyArrayListTest5 {
    public static void main(String[] args) {
        MyArrayList ma = new MyArrayList();
        for (int i=100; i<=120; i++) {
            ma.add(i);
        }

        System.out.println(ma);
        MyArrayList ma2 = ma.map(item -> item <= 110 ? item + 1 : item * 2); //110이하는 +1 나머지는 * 2

        System.out.println(ma2); //[ 101, 102, 103, 104, 105, 1 ..... ]
    }
}
