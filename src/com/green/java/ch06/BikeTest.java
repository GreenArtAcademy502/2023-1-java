package com.green.java.ch06;

import java.util.Scanner;

public class BikeTest {
    public static void main(String[] args) {
        int num = Integer.parseInt("12");
        Scanner scan = new Scanner(System.in);
        Bike b1 = new Bike();


        Bike b2 = new Bike("야마하");

        System.out.println("b1.brand : " + b1.brand);
        System.out.println("b2.brand : " + b2.brand);
    }
}
