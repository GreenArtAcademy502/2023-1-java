package com.green.java.ch12;

public class GBox<T> {
    private T obj;

    public void setItem(T obj) {
        this.obj = obj;
    }

    public T getItem() {
        return obj;
    }
}
