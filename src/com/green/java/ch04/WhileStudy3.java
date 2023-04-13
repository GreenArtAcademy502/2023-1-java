package com.green.java.ch04;

import java.util.Scanner;

public class WhileStudy3 {
    public static void main(String[] args) {
        int input, answer;
        Scanner scan = new Scanner(System.in);
        answer = (int)(Math.random() * 100) + 1; //1~100
        System.out.println(answer);

        while(true) {
            System.out.print("1~100사이의 정수를 입력: ");
            input = scan.nextInt();

            if(input == 0) { break; }

            if(input > answer) {
                System.out.println("down");
            } else if(input < answer) {
                System.out.println("up");
            }
        }
        System.out.println("good!");
    }
}
