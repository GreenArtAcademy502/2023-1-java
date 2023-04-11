package com.green.java.ch04;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = 'D', opt = ' ';

        System.out.print("점수를 입력하세요 > ");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        if(score > 100 || score < 0) {
            System.out.println("점수는 0~100점 사이입니다.");
        } else {
            if(score >= 90) {
                grade = 'A';
            } else if(score >= 80) {
                grade = 'B';
            } else if(score >= 70) {
                grade = 'C';
            }

            int num = score % 10;
            if(grade != 'D') {
                if(num >= 8 || score == 100) {
                    opt = '+';
                } else if(num < 4) {
                    opt = '-';
                } else {
                    opt = '0';
                }
            }

            // 100점 > A+
            // 90점 보다 크거나 같으면 "%d점의 학점은 A+입니다."
            // 80점 보다 크거나 같으면 "%d점의 학점은 B-입니다."
            // 70점 보다 크거나 같으면 "%d점의 학점은 C0입니다."
            // 70점 미만 opt 없음 무조건 D학점, 나머지 "%d점의 학점은 D입니다."

            //1의 3자리가 8점이상 +, 4미만 -, 나머지 0
            System.out.printf("%d점의 학점은 %c%c입니다.", score, grade, opt);
        }
    }
}
