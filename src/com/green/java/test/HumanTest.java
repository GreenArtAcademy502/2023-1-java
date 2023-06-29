package com.green.java.test;

public class HumanTest {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setName("홍길동");
        h1.setAge(10);

        h1.setName("홍길동").setAge(10).setAddr("대구");
    }
}
