package com.green.java.ch07;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireCar fc = new FireCar();
        FireCar fc2 = null;

        fc.water();
        car = fc;

        //car.water();
        //car = new Car();
        if(car instanceof FireCar) {
            fc2 = (FireCar)car;
            fc2.water();
            //car.water();
        } else {
            System.out.println("안돼!!");
        }
    }
}

class Car {
    void drive() {
        System.out.println("drive, Brrrrr~");
    }
    void stop() {
        System.out.println("stop!!!");
    }
}

class FireCar extends Car {
    void water() {
        System.out.println("water!!!");
    }
}
