package com.green.java.ch07.arraylist;

public class MyArrayListTest2 {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add(10);
        myList.add(22);
        myList.add(4);
        myList.add(200);
        myList.add(53);
        myList.add(96);

        System.out.println(myList);
        myList.bubbleSort();
        System.out.println(myList);
    }
}
