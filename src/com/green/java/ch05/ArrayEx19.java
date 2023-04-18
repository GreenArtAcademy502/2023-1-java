package com.green.java.ch05;

/*
    번호  국어  영어  수학  총점  평균
    ==============================
    1   100    90    80  270   90.0
    2    20    20    20   60   20.0
    ...
    ==============================
    총점
    국어: 190
    영어: 180
    수학: 170
    
    Coding by 황주은
 */
public class ArrayEx19 {
    public static void main(String[] args) {
        int sum=0;
        int ko = 0;
        int math = 0;
        int en = 0;
        int[][] score = {
                  { 100, 90, 80 }
                , {  20, 20, 20}
                , {  30, 30, 30}
                , {  40, 40, 40}
        };

        for (int i = 0; i < score.length; i++) {
            ko += score[i][0];
            en += score[i][1];
            math += score[i][2];
        }
        System.out.println("번호  국어  영어  수학  총점  평균\n" +
                "    ==============================\n" +
                "    1   100    90    80  270   90.0\n" +
                "    2    20    20    20   60   20.0\n" +
                "    ...\n" +
                "    ==============================");
        System.out.printf("총점\n국어:%d \n영어:%d \n수학:%d",ko,en,math);

    }
}
