package com.green.java.ch05;

/*
    numArr 배열을 이용하여
    모든 방의 값을 더해서 출력해 주세요.

    sum: ??
 */
public class ArrayQuiz4 {
    public static void main(String[] args) {
        int[] numArr = { 11, 14, 2, 7, 36, 35 };
        int sum = 0;
        for(int i=0; i<numArr.length; i++) {
            sum += numArr[i];
        }

        System.out.printf("sum : %d\n", sum);
    }
}
