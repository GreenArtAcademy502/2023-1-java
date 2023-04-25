package com.green.java.ch07;

public class Human {
    private String name;
    private int age;
    private String job;

    public Human() {}

    public Human(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }


//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setJob(String job) {
//        this.job = job;
//    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
