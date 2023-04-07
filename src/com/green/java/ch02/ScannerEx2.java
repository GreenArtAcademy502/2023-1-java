package com.green.java.ch02;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = "박도흠"; //본인 이름 작성
        int age = 30;
        System.out.print("나이 입력: ");
        System.out.printf("나이는 %d입니다.", (age-1));


        //나의 이름은 박도흠이고 나이는 00살 입니다.
    }
}
