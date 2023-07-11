package com.green.java.ch14;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class RefMethod2 {
    public static void main(String[] args) {
        Function<Integer, MyClass2> f = MyClass2::new;
        MyClass2 mc2 = f.apply(10);
        System.out.println(mc2.getNum());

        Supplier<MyClass2> s = MyClass2::new;
        MyClass2 mc22 = s.get();
        System.out.println(mc22.getNum());

        BiFunction<String, Integer, MyClass2> f2 = MyClass2::new;
        MyClass2 mc222 = f2.apply("홍길동", 10);

        BiFunction<Integer, String, MyClass2> f3 = MyClass2::new;
        MyClass2 mc2222 = f3.apply(12, "홍길동");

    }
}

class MyClass2 {
    private int num;
    private int age;
    private String name;
    public MyClass2() {}

    public MyClass2(int num) { this.num = num; }


    public MyClass2(int age, String name) {
        System.out.println("int, String");
        this.age = age;
        this.name = name;
    }

    public MyClass2(String name, int num) {
        System.out.println("String, int");
        this.num = num;
        this.name = name;
    }

    public int getNum() { return num; }
    public void setNum(int num) { this.num = num; }
}