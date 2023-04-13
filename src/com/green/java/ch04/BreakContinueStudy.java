package com.green.java.ch04;

public class BreakContinueStudy {
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            System.out.print(i + ", ");

            if(i == 5) {
                System.out.println("\n5에서 끝!");
                break;
            }
        }
        System.out.println("----------");
        for(int i=0; i<10; i++) {
            if(i == 5) {
                continue;
            }
            System.out.print(i + ", ");
        }
    }
}
