package com.green.java.ch05;

//p.214
public class MultiArrayStudy1 {
    public static void main(String[] args) {
//        int[][] temp = {
//                {0, 0, 0},
//                {0, 0, 3, 0},
//                {0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0},
//        };
        int[] temp0 = {0, 0, 0};
        int[] temp1 = {1, 0, 3, 0};
        int[] temp2 = {0, 0, 0, 0, 0};
        int[] temp3 = {0, 0, 0, 0, 0, 0};

        int[][] temp = { temp0, temp1, temp2, temp3 };

        System.out.printf("temp.length: %d\n", temp.length);
        System.out.printf("temp[0].length: %d\n", temp[0].length);
        System.out.printf("temp[1].length: %d\n", temp[1].length);
        System.out.printf("temp[2].length: %d\n", temp[2].length);

        System.out.println("temp[1].hashCode() : " + temp[1].hashCode());
        System.out.println("temp1.hashCode() : " + temp1.hashCode());
        System.out.printf("temp[1][0] > %d\n", temp[1][2]);
        System.out.printf("temp1[0] > %d\n", temp1[2]);
        int[] arr0 = temp[0];
        arr0[0] = 30;
        System.out.printf("temp[0][0] > %d\n", temp[0][0]);



        int[][] score = new int[4][3];

        System.out.println(score[0][0]);
        score[2][1] = 10;

        System.out.println("score.length : " + score.length);
        System.out.println(score[2][1]);
        System.out.println("score[0].length : " + score[2].length);

        int[][][] dd = new int[2][3][4];
    }
}
