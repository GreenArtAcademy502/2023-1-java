package com.green.java.ch04;

import java.util.Scanner;

public class IfStudy3 {
    public static void main(String[] args) {
        final int WOMAN_HEIGHT_STAND = 158;
        final int MAN_HEIGHT_STAND = 171;

        Scanner scan = new Scanner(System.in);
        System.out.print("성별 입력 (w, m): ");
        String gender = scan.nextLine();

        System.out.print("키 입력 (cm): ");
        int height = scan.nextInt();

        if(gender.equals("w")) {


            if(height > WOMAN_HEIGHT_STAND) {
                System.out.println("평균 초과");
            } else if(height < WOMAN_HEIGHT_STAND) {
                System.out.println("평균 미만");
            } else {
                System.out.println("평균");
            }

        } else if(gender.equals("m")) {

            if(height > MAN_HEIGHT_STAND) {
                System.out.println("평균 초과");
            } else if(height < MAN_HEIGHT_STAND) {
                System.out.println("평균 미만");
            } else {
                System.out.println("평균");
            }

        } else {
            System.out.println("성별을 잘 못 입력!");
        }

        //m, 171 > 평균
        //m, 172 초과값 > 평균 초과
        //m, 170 이하값 > 평균 미만

        //w, 158 > 평균
        //w, 158 초과값 > 평균 초과
        //w, 158 이하값 > 평균 미만
    }
}
