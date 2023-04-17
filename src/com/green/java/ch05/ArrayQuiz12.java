package com.green.java.ch05;

import java.util.Arrays;

/*
    numArr 배열을 섞어주세요.
 */
public class ArrayQuiz12 {
    public static void main(String[] args) {
        int[] numArr = { 11, 14, 2, 7, 36, 35 };
        for(int i=0; i<numArr.length; i++) {
            int rIdx = (int)(Math.random() * numArr.length);
            if(i == rIdx) { continue; }
            int temp = numArr[i];
            numArr[i] = numArr[rIdx];
            numArr[rIdx] = temp;
        }

        System.out.println(Arrays.toString(numArr));
    }
}
