package com.green.java.ch04;

import java.util.Scanner;
/*
합계를 구할 숫자를 입력하세요. (끝내려면 0)
>> 100
>> 23
>> 0
합계: 123
 */
public class FlowEx27 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true; //while 조건식으로 사용하세요.
        Scanner scan = new Scanner(System.in);
        System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0)");

        while(flag) {
            System.out.print(">> ");
            num = scan.nextInt();

            if(num == 0) {
                flag = false;
            } else {
                sum += num;
            }
        }
        System.out.println("합계: " + sum);
    }
}
