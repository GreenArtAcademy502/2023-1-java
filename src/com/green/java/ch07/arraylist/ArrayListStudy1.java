package com.green.java.ch07.arraylist;

import java.util.ArrayList;

public class ArrayListStudy1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10); //0번방
        list.add(20); //1번방
        list.add("ddd");

        Object obj = 10;

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        int n1 = (int)list.get(0);
        int n2 = (int)list.get(1);
        String str1 = (String)list.get(2);


    }
}
