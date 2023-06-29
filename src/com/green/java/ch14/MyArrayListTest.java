package com.green.java.ch14;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList mList = new MyArrayList();
        mList.add(10);
        mList.add(11);
        mList.add(20);
        mList.add(23);
        mList.add(30);
        mList.add(35);

        System.out.println(mList); // [ 10, 11, 20, 23, 30, 35 ]

        mList.forEach(item -> System.out.println(item));
        mList.forEach(item -> System.out.println(item * 2));
        MyArrayList mapList = mList.filter(item -> item % 2 == 0);

        System.out.println("-------------");
        List<Integer> realList = new ArrayList<>();
        realList.add(10);
        realList.add(20);
        realList.add(30);
        realList.add(40);
        realList.forEach(item -> System.out.println(item));
    }
}
