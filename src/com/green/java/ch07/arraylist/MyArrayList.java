package com.green.java.ch07.arraylist;

public class MyArrayList extends Object {

    private int[] items;

    public MyArrayList() {
        items = new int[0];
    }

    public void add(int value) {
        int[] temp = new int[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            temp[i] = items[i];
        }
        temp[items.length] = value;
        items = temp;
    }

    public void add(int idx, int value) {
        if(idx > items.length) { return; }

        int[] temp = new int[items.length + 1];
        temp[idx] = value;
        for (int i = 0; i < items.length; i++) {
            if(i<idx) {
                temp[i] = items[i];
            } else {
                temp[i+1] = items[i];
            }
        }
        items = temp;
    }

    public void set(int idx, int val) {
        this.items[idx] = val;
    }

    public int size() {
        return items.length;
    }

    public int get(int idx) {
        return items[idx];
    }

    public void printAllValue() {
        for (int i = 0; i < this.size(); i++) {
            System.out.println(this.get(i));
        }
    }

    public void bubbleSort() {
        for (int i = items.length - 1; i > 0; i--) {
            for(int z=0; z<i; z++) {
                int sideIdx = z + 1;
                if(items[z] > items[sideIdx]) {
                    int temp = items[z];
                    items[z] = items[sideIdx];
                    items[sideIdx] = temp;
                }
            }
        }
    }

    public boolean contains(int pVal) {
        for(int val : items) {
            if(val == pVal) { return true; }
        }
        return false;
    }

    @Override
    public String toString() {
        String str = "[";
        if(items.length > 0) {
            str += items[0];
            for (int i = 1; i < items.length; i++) {
                str += ", " + items[i];
            }
        }
        str += "]";
        return str;
    }
}
