package com.green.java.constructor;

public class Human {
    private int age;
    private final String name;

    public Human(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return String.format("age: %d, name: %s", age, name);
    }
}
