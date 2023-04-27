package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.add(1, 100);
        list.add(4, 300);
        System.out.println(list);

        int removeValue = list.remove(4);
        System.out.println("removeValue : " + removeValue);

        System.out.println(list);
        System.out.println(list.size());
    }
}
