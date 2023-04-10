package com.green.java.ch02;

public class VarEx1 {
    //p.21
    public static void main(String[] args) {
        int year = 0; //0을 변수 선언을 int 타입으로 했고
        int age = 14; //변수명 age 타입은 int, 14값 대입 (초기화)
        
        System.out.println(year);
        System.out.println(age);

        year = age + 2000;
        age = age + 1;

        System.out.println(year);
        System.out.println(age);
    }
}
