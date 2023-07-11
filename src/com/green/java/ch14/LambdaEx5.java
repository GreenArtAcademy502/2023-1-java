package com.green.java.ch14;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class ConsumerImple implements Consumer<Integer> {

    @Override
    public void accept(Integer i) {
        System.out.println(i);
    }
}

public class LambdaEx5 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random() * 100) + 2;
//        System.out.println(s.get());
//        System.out.println(s.get());
//        System.out.println(s.get());
//        System.out.println(s.get());

        Consumer<Integer> c3 = new ConsumerImple();
        Consumer<Integer> c = a -> System.out.println(a);
        Consumer<Integer> c4 = System.out::print;
        Consumer<Integer> c2 = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        };
        int val = 9;
        Predicate<Integer> p1 = i -> i > 10;
        System.out.printf("%d > 10 : %b\n", val, p1.test(val));


        Function<Double, Integer> fn1 = dVal -> dVal.intValue();

        System.out.println(fn1.apply(10.5));
        System.out.println(fn1.apply(11.5121212));
        System.out.println(fn1.apply(11212.5328338));

        //Wrapper Type
        //int > Integer
        //short > Short
        //long > Long
        //double > Double
        //float > Float

        Integer n1 = 10;
        int n2 = n1;
        Integer n3 = 20;
        n1 = 20;

        System.out.println(n1 == n3);

        String s1 = "안녕";
        String s2 = "안녕";

        System.out.println(s1 == s2);
    }

}
