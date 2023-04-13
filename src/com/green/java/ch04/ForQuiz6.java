package com.green.java.ch04;

/*
    2 X 1 = 2   3 X 1 = 3   4 X 1 = 4 ... 9 X 1 = 9
    2 X 2 = 4   3 X 2 = 6 ...
    ...
    2 X 9 = 18  3 X 9 = 27 ...

 */
public class ForQuiz6 {
    public static void main(String[] args) {
        for(int i=1; i<10; i++) {
            for(int z=2; z<10; z++) {
                System.out.printf("%d X %d = %d \t", z, i, z * i);
            }
            System.out.println();
        }
    }
}
