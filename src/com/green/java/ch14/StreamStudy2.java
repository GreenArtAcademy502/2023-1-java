package com.green.java.ch14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStudy2 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10, 20, 3, 4, 5, 4, 3, 20, 10, 100, 200, 300);
        List<Integer> resultList = intList.stream()
                                        .distinct()
                                        .skip(2)
                                        .limit(3)
                                        .toList();

        System.out.println(intList);
        System.out.println(resultList);

        System.out.println("--------");
        IntStream.range(1, 5).forEach(System.out::println);
        IntStream.rangeClosed(1, 5).forEach(System.out::println);

        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=10; i++) {
            list.add(i);
        }
        System.out.println(list);

        List<Integer> list3 = Arrays.stream(IntStream.rangeClosed(1, 100).toArray())
                                    .boxed()
                                    .collect(Collectors.toList());

        IntStream is = IntStream.rangeClosed(1, 100);
        Stream<Integer> streamInteger = is.boxed();
        List<Integer> list5 = streamInteger.toList();

        List<Integer> list4 = IntStream.rangeClosed(1, 100).boxed().toList();
        System.out.println(list4);

        //List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(arr2));
    }
}
