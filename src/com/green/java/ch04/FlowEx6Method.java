package com.green.java.ch04;

import java.util.Scanner;

class SeasonObj {

    String getSeason(int mon) {
        if(mon > 12 || mon < 1) {
            return null;
        } else if(mon == 12 || mon <= 2) {
            return "겨울";
        } else if(mon >= 9) {
            return "가을";
        } else if(mon >= 6) {
            return "여름";
        } else {
            return "봄";
        }
    }
//    String getSeason(int mon) {
//        switch(mon) {
//            case 3: case 4: case 5:
//                return "봄";
//            case 6: case 7: case 8:
//                return "여름";
//            case 9: case 10: case 11:
//                return "가을";
//            case 12: case 1: case 2:
//                return "겨울";
//        }
//        return null;
//    }
}

public class FlowEx6Method {
    //switch 사용하여
    //mon 값이
    //3, 4, 5라면 "봄"
    //6, 7, 8라면 "여름"
    //9, 10, 11라면 "가을"
    //12, 1, 2라면 "겨울"
    //이외의 값은 null 리턴 return null;

    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요. (1~12) : ");
        Scanner scan = new Scanner(System.in);
        int mon = scan.nextInt();
        SeasonObj so = new SeasonObj();
        String result = so.getSeason(mon);
        if(result == null) {
            System.out.println("잘못된 입력입니다.");
            return;
        }
        System.out.printf("현재의 계절은 %s입니다.", result);
    }
}
