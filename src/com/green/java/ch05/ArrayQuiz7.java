package com.green.java.ch05;

import java.util.Arrays;

/*
    numArr 배열을 이용하여
    copyArr은 numArr보다 1칸 더 많은 배열을 만들어주세요.
    마지막 방에는 100을 넣어주세요.
    copyArr에 numArr을 deep copy 해주세요.

    copyArr값을 모두 출력해 주세요.

 */
public class ArrayQuiz7 {
    public static void main(String[] args) {
        int[] numArr = { 11, 14, 2, 7, 36, 35, 80, 90, 1 }; //9
        int[] copyArr = new int[numArr.length + 1]; //10

        copyArr[numArr.length] = 100;
        //copyArr[copyArr.length - 1] = 100;

        for(int i=0; i<numArr.length; i++) {
            copyArr[i] = numArr[i];
        }
        System.out.println(Arrays.toString(numArr));
        String result = Arrays.toString(copyArr);
        System.out.println(result);

        numArr = copyArr;

    }
}
