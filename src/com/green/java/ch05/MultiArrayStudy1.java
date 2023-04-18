package com.green.java.ch05;

//p.214
public class MultiArrayStudy1 {
    public static void main(String[] args) {
        int[][] temp = {
                {0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
        };
        System.out.printf("temp.length: %d\n", temp.length);
        System.out.printf("temp[0].length: %d\n", temp[0].length);
        System.out.printf("temp[1].length: %d\n", temp[1].length);
        System.out.printf("temp[2].length: %d\n", temp[2].length);


        System.out.printf("temp[0][0] > %d\n", temp[0][0]);
        int[] arr0 = temp[0];
        arr0[0] = 30;
        System.out.printf("temp[0][0] > %d\n", temp[0][0]);



        int[][] score = new int[4][3];

        System.out.println(score[0][0]);
        score[2][1] = 10;

        System.out.println(score.length);
        System.out.println(score[0].length);
    }
}
