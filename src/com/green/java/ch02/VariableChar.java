package com.green.java.ch02;

public class VariableChar {
    public static void main(String[] args) {
        //변수 선언과 초기화 동시 가능
        char c1 = 'A'; //문자, 문자열X, 홑따옴표 사용.
        System.out.println(c1);

        c1 = '한';
        System.out.println(c1);

        c1 = 'B';
        System.out.printf("%c : %d \n", c1, (int)c1);
    }
}
