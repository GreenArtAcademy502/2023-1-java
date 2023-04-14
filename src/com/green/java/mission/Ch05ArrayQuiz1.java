package com.green.java.mission;

/*
    rNumArr은 6칸 가지고 있는 정수형 배열입니다.
    각 칸에 랜덤한 숫자 1~45사이의 값을
    모든 칸에 넣어주세요.

    Coding By 남규진
 */
public class Ch05ArrayQuiz1 {
    public static void main(String[] args) {
        int[] rNumArr = new int[6];

        for (int i = 0; i < rNumArr.length; i++) {
            rNumArr[i] = (int)(Math.random() * 45) + 1;
        }

        for (int i = 0; i < rNumArr.length; i++) {
            System.out.println(rNumArr[i]);
        }
    }
}
