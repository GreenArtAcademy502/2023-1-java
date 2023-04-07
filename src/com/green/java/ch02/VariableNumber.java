package com.green.java.ch02;
public class VariableNumber {
    public static void main(String[] args) {
        //변수 숫자형
        byte b1; //1byte
        short s1; //2byte
        long l1; //8byte
        int n1; //(정수형)변수 선언 //4byte
        //int n1; //변수 선언은 1번만 가능.
        n1 = 10; //=은 대입연산자, 오른쪽값 복사하여 왼쪽에 주입
        System.out.println(n1);

        n1 = 20;
        System.out.println(n1);
    }
}
