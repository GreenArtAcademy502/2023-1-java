package com.green.java.ch07.arraylist;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(50);

        myList.add(4, 100);
        myList.add(4, 100);

        System.out.println(myList);

        System.out.println(myList.size());
        //[10, 20, 30]
        for (int i = 0; i < myList.size(); i++) {
            int val = myList.get(i);
            System.out.println(val);
        }
        System.out.println("--------------");

        int sum = 0;
        for (int i = 0; i < myList.size(); i++) {
            //int val = myList.get(i);
            //sum = sum + val;
            //sum += val;

            sum += myList.get(i);
        }
        System.out.println("sum : " + sum);
    }
}
