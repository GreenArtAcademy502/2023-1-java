package com.green.java.ch05;

/*
    numArr 배열을 이용하여
    copyArr에 numArr을 deep copy 해주세요.
    copyArr값을 모두 출력해 주세요.
    copyArr[0] > 11
    copyArr[1] > 14
    ...
    copyArr[5] > 35
 */
public class ArrayQuiz6 {
    public static void main(String[] args) {
        int[] numArr = { 11, 14, 2, 7, 36, 35 };
        int[] copyArr = new int[numArr.length];

        //deep copy 하고
        for(int i=0; i<numArr.length; i++) {
            copyArr[i] = numArr[i];
        }
        numArr[0] = 33;

        //copyArr의 모든값을 출력해.
        for(int i=0; i<numArr.length; i++) {
            System.out.printf("numArr[%d] > %d\n", i, numArr[i]);
        }
        System.out.println("-------------");
        for(int i=0; i<copyArr.length; i++) {
            System.out.printf("copyArr[%d] > %d\n", i, copyArr[i]);
        }
    }
}
