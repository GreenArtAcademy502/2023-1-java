package com.green.java.ch06;

public class CarTest2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = "소나타";
        c1.price = 2000;

        Car.brand = "기아";
        Car.powerOn();

        c1.printInfo();
        //Integer.parseInt("11");
    }
}
