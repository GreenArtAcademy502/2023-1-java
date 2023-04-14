package com.green.java.mission;

import java.util.Scanner;

/*
합계를 구할 숫자를 입력하세요. (끝내려면 0)
>> 100
>> 23
>> 77
>> 0
합계: 200

Coding By 김재경
 */
public class Ch05FlowEx27 {
    public static void main(String[] args) {
        int i = 0 ,sum = 0;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print(">>");
            i = scan.nextInt();
            if (i  ==  0){
                break;
            }
            sum += i;
        }
        System.out.printf("합계 : %d" , sum);
    }

}
