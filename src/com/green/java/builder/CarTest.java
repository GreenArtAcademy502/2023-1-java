package com.green.java.builder;

public class CarTest {
    public static void main(String[] args) {

        //Car c2 = new Car();

        Car.Builder cb = Car.builder();
        cb.cc(100);
        cb.brand("쉐보레");
        Car c2 = cb.build();

        System.out.println(c2);
        System.out.println("----");


        System.out.println("----");
        Car c1 = Car.builder()
                    .cc(1000)
                    .build();

        System.out.println(c1);


    }
}
