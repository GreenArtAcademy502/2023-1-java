package com.green.java.ch03;

import java.util.Scanner;

public class OperatorStudy8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        int num = scan.nextInt();


        String result = num % 2 == 0 ? "짝수" : "홀수";
        //num값이 홀수면 "홀수" 출력.
        //num값이 짝수면 "짝수" 출력.
        System.out.printf("숫자 %d는 %s이다.", num, result);

    }
}
