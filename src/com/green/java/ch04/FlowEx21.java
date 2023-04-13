package com.green.java.ch04;
//p.165
/*
    [1, 1]
          [2, 2]
                [3, 3]
 */
public class FlowEx21 {
    public static void main(String[] args) {
        int num = 4;
        for(int i=1; i<num; i++) {
            for(int z=1; z<num; z++) {
                if(i == z) {
                    System.out.printf("[%d,%d]", i, z);
                } else {
                    System.out.printf("%5c", ' ');
                }
            }
            System.out.println();
        }
    }
}
