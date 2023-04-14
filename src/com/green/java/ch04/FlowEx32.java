package com.green.java.ch04;

import java.util.Scanner;

/*
(1) squre
(2) square root
(3) log
원하는 메뉴(1~3)를 선택하세요. (종료: 0) > 4
메뉴를 잘못 선택하셨습니다.(종료: 0)
(1) squre
(2) square root
(3) log
원하는 메뉴(1~3)를 선택하세요. (종료: 0) > 1
선택하신 메뉴는 1번입니다.
(1) squre
(2) square root
(3) log
원하는 메뉴(1~3)를 선택하세요. (종료: 0) > 0
프로그램을 종료합니다.
 */
public class FlowEx32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("(1) squre");
            System.out.println("(2) squre root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료: 0) > ");
            int menu = scan.nextInt();

            if(menu < 0 || menu > 3) {
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료: 0)");
            } else if(menu == 0) {
                break;
            } else {
                System.out.printf("선택하신 메뉴는 %d번입니다.\n", menu);
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
