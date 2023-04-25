package com.green.java.ch07.poly;

public class PolyQuiz1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("뽀삐");
        Bulldog bd1 = new Bulldog();
        Cat cat1 = new Cat();
        Duck duck1 = new Duck();

        Animal ani = dog1;
        ani = bd1;
        ani = cat1;
        ani = duck1;
        PolyQuiz1.animalCryingCall(dog1);
        PolyQuiz1.animalCryingCall(bd1);
        animalCryingCall(cat1);
        animalCryingCall(duck1);
    }

    static void animalCryingCall(Animal ani) {
        ani.crying();
        if(ani instanceof Dog) {
            Dog dog = (Dog)ani;
            dog.jump();
        }
    }


}
