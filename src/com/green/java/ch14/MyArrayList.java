package com.green.java.ch14;

@FunctionalInterface
interface MyConsumer {
    void accept(int num);
}

@FunctionalInterface
interface MyPredicate {
    boolean test(int num);
}

@FunctionalInterface
interface MyFunction2 {
    int apply(int p);
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

    public MyArrayList map(MyFunction2 fn) {
        MyArrayList temp = new MyArrayList();
        for(int i=0; i<this.arr.length; i++) {
            int val = fn.apply(this.arr[i]);
            temp.add(val);
        }
        return temp;
    }

    public MyArrayList filter(MyPredicate predicate) {
        MyArrayList temp = new MyArrayList();
        for(int i=0; i<this.arr.length; i++) {
            int val = this.arr[i];
            if(predicate.test(val)) {
                temp.add(val);
            }
        }
        return temp;
    }
    public void removeIf(MyPredicate predicate) {
        int[] temp = new int[this.arr.length];
        int idx = 0;
        for (int i = 0; i < this.arr.length; i++) {
            if (!predicate.test(this.arr[i])) {
                int val = this.arr[i];
                temp[idx++] = val;
            }
        }
        int[] temp2 = new int[idx];
        for (int i = 0; i < temp2.length; i++) {
            temp2[i] = temp[i];
        }
        this.arr = temp2;
    }

    public void replaceAll(MyFunction2 fn) {
        for(int i=0; i<this.arr.length; i++) {
            this.arr[i] = fn.apply(this.arr[i]);
        }
    }

    public static MyArrayList asList(int... nums) {
        MyArrayList ma = new MyArrayList();
        for(int i=0; i<nums.length; i++) {
            int val = nums[i];
            ma.add(val);
        }
        return ma;
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
