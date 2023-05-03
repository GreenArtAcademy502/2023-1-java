package com.green.java.ch07;

public class ChildTest {
    public static void main(String[] args) {
        Child ch = new Child(76);
        Child ch2 = new Child();


        ch.play();
        ch.age = 10;
        System.out.println(ch.age);
        ch.play();

        GrandChild gc = new GrandChild();
        gc.age = 20;
        gc.play();

    }
}
