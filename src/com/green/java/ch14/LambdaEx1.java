package com.green.java.ch14;

@FunctionalInterface
interface MyFunction {
    void run();
}

public class LambdaEx1 {
    static void execute(MyFunction f) { f.run(); }

    public static MyFunction getMyFunction() {
        return () -> System.out.println("mf1");
    }

    public static void main(String[] args) {
        execute(getMyFunction());
    }
}
