package com.green.java.ch05;
//p.207, p.166(향상된 for문, foreach)
public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = { "Kim", "Park", "Yi" };
        for(int i=0; i<names.length; i++) {
            System.out.printf("names[%d]: %s\n", i, names[i]);
        }
        names[0] = "Yu";
        int i=0;
        for(String nm : names) {
            System.out.printf("names[%d]: %s\n", i++, nm);
        }

    }
}
