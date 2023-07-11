package com.green.java.ch14;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListTest4 {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        for(int i=100; i<=120; i++) {
//            list.add(i);
//        }
//
//        List<Integer> rList = list.stream().map(item -> item +4).toList();
//        System.out.println(rList);
//        System.out.println(list);

        MyArrayList ma = new MyArrayList();
        for(int i=100; i<=120; i++) {
            ma.add(i);
        }
        MyArrayList rMa = ma.map(item -> item + 4);

        MyFunction2 mf2 = item -> item + 4;

        MyFunction2 mf22 = new MyFunction2() {
            @Override
            public int apply(int item) {
                return item + 4;
            }
        };

        MyFunction2 mf222 = new Myfunction2Impl();
        System.out.println(rMa); //[104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124]

    }
}

class Myfunction2Impl implements MyFunction2 {
    @Override
    public int apply(int item) {
        return item + 4;
    }
}