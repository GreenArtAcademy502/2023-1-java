package com.green.java.ch07.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudy2 {
    public static void main(String[] args) {
        int a = 10;
        Integer a2 = a;

        double d = 10.2;

        //generic 제네릭
        List<Integer> list = new ArrayList<>();
        //list.add("11");
        //list.add(10.1);
        //list.add(true);
        list.add(10);
        list.add(13);


        int n1 = list.get(1);
        System.out.println("n1 : " + n1);
        System.out.println(list);

    }
}
