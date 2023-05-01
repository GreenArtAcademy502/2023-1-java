package com.green.java.ch05;

import java.util.Arrays;

public class ArrayQuiz13 {
    public static void main(String[] args) {
        int[] lottoArr = new int[6];
        setRandomValuArr2(lottoArr);
        //아래 둘 중 가능한 작업 하나만 해주세요.
        //1. 중복되지 않는 1~45의 값을 배열에 채운다.
        //2. 중복허용된 1~45의 값을 배열에 채운다.
        System.out.println(Arrays.toString(lottoArr));

        //오름차순 정렬(버블정렬)
        sortArr(lottoArr);
        System.out.println(Arrays.toString(lottoArr));
    }

    public static void sortArr(int[] lottoArr) {
        for (int i = lottoArr.length - 1; i > 0; i--) {
            for(int z=0; z<i; z++) {
                if(lottoArr[z] > lottoArr[z + 1]) {
                    int temp = lottoArr[z];
                    lottoArr[z] = lottoArr[z + 1];
                    lottoArr[z + 1] = temp;
                }
            }
        }
    }

    public static int getRandomValueFromTo(int sVal, int eVal) {
        return (int)(Math.random() * (eVal - sVal + 1)) + sVal;
    }

    public static void setRandomValuArr2(int[] lottoArr) {
        Loop:
        for(int i=0; i<lottoArr.length; ) {
            int rVal = getRandomValueFromTo(1, 45);
            for(int z=0; z<i; z++) {
                if(lottoArr[z] == rVal) { continue Loop; }
            }
            lottoArr[i++] = rVal;
        }
    }

    public static void setRandomValuArr1(int[] lottoArr) {
        for(int i=0; i<lottoArr.length; i++) {
            int rVal = getRandomValueFromTo(1, 45);
            for(int z=0; z<lottoArr.length; z++) {
                if(lottoArr[z] == 0) {
                    lottoArr[z] = rVal;
                    break;
                } else if(lottoArr[z] == rVal) {
                    i--;
                    break;
                }
            }
        }
    }
}
