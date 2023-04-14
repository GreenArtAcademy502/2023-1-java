package com.green.java.ch05;

public class ArrayStudy1 {
    public static void main(String[] args) {
        //배열: 같은 타입의 여러값을 저장하기 위한 공간
        int n1=1, n2=2, n3=3;
        n1 = 2;

        int[] numArr = {10, 20, 30, 40};
        int numArr2[] = { 10, 20 };

        numArr[0] = 11;
        int num = numArr[1];
        System.out.println("num : " + num);
    }
}
