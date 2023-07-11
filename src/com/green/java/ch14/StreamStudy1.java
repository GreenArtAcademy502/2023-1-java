package com.green.java.ch14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStudy1 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 3, 4, 5, 4, 3, 20, 10, 100, 200, 300);
//        Stream<Integer> intStream = intList.stream();
//        intStream.forEach(System.out::println);
//
//        System.out.println("------");
        intList.stream()
                .distinct()
                .skip(2)
                .limit(3)
                .forEach(item -> {
                    System.out.print(item + ",");
                });

        System.out.println("------");
        int[] intArr = { 99, 1, 2, 9, 3, 110, 4, 5 };
        IntStream intArrStream = Arrays.stream(intArr);
        intArrStream.sorted().forEach(System.out::println);
        System.out.println(Arrays.toString(intArr));
        //Stream<int[]> intArrStream = Stream.of(intArr);

    }
}
