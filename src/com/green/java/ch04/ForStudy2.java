package com.green.java.ch04;

public class ForStudy2 {
    public static void main(String[] args) {
        //for문 이용
        //print는 for문 안에서만 사용
        //1, 2, 3, 4, 5 (마지막 콤마 없음)
        for(int i=1; i<6; i++) {
            if(i == 5) {
                System.out.print(i);
            } else {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\n--------");
        for(int i=1; i<7; i++) {
            System.out.print(i);
            if(i < 6) {
                System.out.print(", ");
            }
        }
        System.out.println("\n--------");
        for(int i=1; i<3; i++) {
            if(i > 1) {
                System.out.print(", ");
            }
            System.out.print(i);
        }
    }
}
