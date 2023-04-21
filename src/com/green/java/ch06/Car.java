package com.green.java.ch06;

public class Car {
    static String brand;
    String model;
    int price;

    static void powerOn() {
        System.out.printf("%s 회사의 차 시동 걸림\n", brand);
    }

    void printInfo() {
        System.out.printf("brand: %s, model : %s, price: %d\n"
                , brand, model, price);
    }
}
