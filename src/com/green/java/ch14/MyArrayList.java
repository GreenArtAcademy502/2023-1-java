package com.green.java.ch14;

@FunctionalInterface
interface MyConsumer {
    void accept(int num);
}

@FunctionalInterface
interface MyPredicate {
    boolean test(int num);
}

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        this.arr = new int[0];
    }

    public void add(int val) {
        int[] temp = new int[arr.length + 1];
        temp[arr.length] = val;
        for(int i=0; i<arr.length; i++) {
            temp[i] = arr[i];
        }
        this.arr = temp;
    }

    public void forEach(MyConsumer consumer) {
       for(int i=0; i<this.arr.length; i++) {
            consumer.accept(this.arr[i]);
        }
    }

    public MyArrayList filter(MyPredicate predicate) {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        for(int i=0; i<this.arr.length; i++) {
            if(i > 0) { sb.append(", "); }
            sb.append(this.arr[i]);
        }
        sb.append(" ]");
        return sb.toString();
    }


}
