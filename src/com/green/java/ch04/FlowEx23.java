package com.green.java.ch04;

/*
    변수 i와 while문을 활용하여
    4 - I can do it.
    3 - I can do it.
    2 - I can do it.
    1 - I can do it.
    0 - I can do it.
 */
public class FlowEx23 {
    public static void main(String[] args) {
        int i = 5;
        while(i-- > 0) {
            System.out.printf("%d - I can do it\n", i);
        }
    }
}
