package com.green.java.ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MyArrayListTest3 {
    public static void main(String[] args) {
        /*
        List<Integer> intList = new ArrayList<>();

        for(int i=100; i<=200; i++) {
            intList.add(i);
        }

        Stream<Integer> filterStream = intList.stream().filter(item -> item % 2 == 0);
        List<Integer> filterList = filterStream.toList();
        System.out.println(filterList);
        */

        MyArrayList intList = new MyArrayList();
        for(int i=100; i<=200; i++) {
            intList.add(i);
        }
        MyArrayList filterList = intList.filter(item -> {
            return item % 2 == 0;
        });
        System.out.println(filterList);

        //100~150, 150초과 부터는 홀수만 담은 MyArrayList를 만들고 싶어.
        MyArrayList filterList2 = intList.filter( item -> item <= 150 || item % 2 == 1 );
        System.out.println(filterList2);

        MyArrayList filterList3 = intList.filter( item -> item <= 150 )
                                         .filter( item -> item % 2 == 1 );
        System.out.println(filterList3);
    }
}
