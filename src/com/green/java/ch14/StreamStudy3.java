package com.green.java.ch14;

import java.util.List;
import java.util.stream.Stream;

public class StreamStudy3 {
    public static void main(String[] args) {
        Stream<Integer> evenStream = Stream.iterate(1, n -> n + 2);
        //evenStream.limit(1000).forEach(System.out::println);

        List<Integer> list = Stream.iterate(1, n -> n + 2).limit(10).toList();
        System.out.println(list);
    }
}
