package com.green.java.ch07;

public class ChildTest2 {
    public static void main(String[] args) {
        Child ch = new Child(10);
        ch.age = 20;

        System.out.printf("super: %d\n", ch.getSuperAge());
        System.out.printf("this: %d\n", ch.getThisAge());
    }
}
