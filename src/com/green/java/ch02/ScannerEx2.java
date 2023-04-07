package com.green.java.ch02;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = "박도흠"; //본인 이름 작성
        int age = 0;
        System.out.print("나이 입력: ");
        String strAge = scan.nextLine();
        age = Integer.parseInt(strAge);
        System.out.printf("나의 이름은 %s이고 나이는 %d살 입니다."
                , name, age - 1);

        scan.close();
        //나의 이름은 박도흠이고 나이는 00살 입니다.
    }
}
