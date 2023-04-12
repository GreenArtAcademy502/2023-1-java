package com.green.java.ch04;

import java.util.Scanner;

public class ForQuiz5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("출력하고 싶은 구구단은? ");
        int gugudan = scan.nextInt();

        for(int i=1; i<10; i++) {
            System.out.printf("%d X %d = %d\n", gugudan, i, (gugudan * i));
        }
    }
}
