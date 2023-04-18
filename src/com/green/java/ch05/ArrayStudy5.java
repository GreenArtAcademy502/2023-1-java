package com.green.java.ch05;

public class ArrayStudy5 {
    public static void main(String[] args) {

        int[] numArr = new int[] { 10, 20, 30, 40, 50, 60, 70 };
        int[] copyArr = new int[numArr.length];


        for(int i=0; i<copyArr.length; i++) {
            System.out.printf("copyArr[%d] : %d\n", i, copyArr[i]);
        }


    }
}
