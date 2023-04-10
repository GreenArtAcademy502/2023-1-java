package com.green.java.ch02;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("두자리 정수를 하나 입력해주세요.>");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 : " + (input + 1));
        System.out.printf("num=%d\n", (num + 1));
    }
}
