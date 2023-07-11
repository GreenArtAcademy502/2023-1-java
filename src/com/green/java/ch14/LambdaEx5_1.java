package com.green.java.ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx5_1 {
    public static void makeRandomList(Supplier<Integer> s, List<Integer> list) {
        for(int i=0; i<10; i++) {
            list.add(s.get());
        }
    }

    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random() * 100) + 1; //1 ~ 100
        Consumer<Integer> c = i -> System.out.print(i + ", ");
        Predicate<Integer> p = i -> i % 2 == 0;
        Function<Integer, Integer> f = i -> i / 10 * 10;
        List<Integer> list = new ArrayList();

        makeRandomList(s, list); //10개의 랜덤한 값(1~100)을 list에 추가해주는 메소드
        System.out.println(list);
        printEvenNum(p, c, list);
        System.out.println();
        List<Integer> newList = doSomething(f, list);
        System.out.println(newList);

        List<Integer> newList2 = doSomething2(f, list);
        System.out.println(newList2);
    }

    public static List<Integer> doSomething(Function<Integer, Integer> f, List<Integer> list) {
        List<Integer> temp = new ArrayList<>();
        for(Integer val : list) {
            temp.add(f.apply(val));
        }
        return temp;
    }

    public static <T> List<T> doSomething2(Function<T, T> f, List<T> list) {
        return list.stream().map(f).toList();
    }

    public static void printEvenNum(Predicate<Integer> p
                                    , Consumer<Integer> c
                                    , List<Integer> list) {
        for(Integer val : list) {
            if(p.test(val)) {
                c.accept(val);
            }
        }
    }

}
