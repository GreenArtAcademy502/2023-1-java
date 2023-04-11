package com.green.java.ch04;

import java.util.Scanner;

public class IfStudy2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("점수 입력: ");
        int score = scan.nextInt();

        if(score > 100 || score < 0) {
            System.out.println("점수는 0~100점 사이입니다.");
        } else if(score >= 90) {
            System.out.println("A");
        } else if(score >= 80) {
            System.out.println("B");
        } else if(score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
        //score값이
        //100초과 or 0미만이면 "점수는 0~100점 사이입니다."
        //90이상 "A"
        //80이상 "B"
        //70이상 "C"
        //나머지 "D" 출력
    }
}
