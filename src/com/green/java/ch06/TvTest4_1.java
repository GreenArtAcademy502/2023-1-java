package com.green.java.ch06;

public class TvTest4_1 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];
        Tv tv = new Tv();

        for(int i=0; i<tvArr.length; i++) {
            tvArr[i] = tv;
            tvArr[i].channel = 10;
        }

        tv.channel = 1;

        System.out.println(tvArr[0].channel); // 1,
        System.out.println(tvArr[1].channel); // 1,
        System.out.println(tvArr[2].channel); // 10,
        System.out.println(tv.channel); // 10,

        String str = "dd";
        for(int i=0; i<tvArr.length; i++) {
            System.out.println(tvArr[i]);
        }
        System.out.println(tv);




    }
}
