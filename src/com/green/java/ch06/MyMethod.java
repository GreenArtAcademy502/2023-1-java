package com.green.java.ch06;

public class MyMethod {

    //void > return type, 리턴타입
    //sum > method name, 메소드명
    //(int n1, int n2) > parameter, 파라미터, 매개변수, 인수
    void sum(int n1, int n2) {
        if(n1 == 20) {
            return;
        }
        System.out.println(n1 + n2);
        return;
    }

    int sum2(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

}
