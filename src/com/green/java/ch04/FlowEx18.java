package com.green.java.ch04;

public class FlowEx18 {
    public static void main(String[] args) {
        //중첩 for문을 이용하여 2~9단 구구단을 출력
        //단수가 바뀌면 빈칸 한 줄 추가

        for(int i=2; i<10; i++) {
            for(int z=1; z<10; z++) {
                System.out.printf("%d X %d = %d\n", i, z, (i * z));
            }
            System.out.println();
        }
    }
}
