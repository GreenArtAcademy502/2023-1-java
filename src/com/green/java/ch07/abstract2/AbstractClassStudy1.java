package com.green.java.ch07.abstract2;

public abstract class AbstractClassStudy1 {
    int multi(int n1, int n2) {
        return n1 * n2;
    }
    abstract void sum(int n1, int n2);
}

class ChildClass extends AbstractClassStudy1 {
    void sum(int n1, int n2) {
        System.out.println("합계 : " + (n1 + n2));
    }
}

class Child2Class extends AbstractClassStudy1 {
    void sum(int n1, int n2) {
        System.out.println("sum : " + (n1 + n2));
    }
}
