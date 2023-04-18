package com.green.java.ch05;

/*
    numArr 배열을 이용하여
    배열에 들어있는 값 평균값 구해주세요.
    소수점은 있다면 2자리까지
    avg: ??
 */
public class ArrayQuiz11 {
    public static void main(String[] args) {
        int[] numArr = { 11, 14, 2, 7, 36, 35, 1000 };
        int sum = 0;

        for (int i = 0; i < numArr.length; i++) {
            sum += numArr[i];
        }

        double avg = (double)sum / numArr.length;

        System.out.printf("sum: %,d, avg: %.2f\n", sum, avg);

    }
}
