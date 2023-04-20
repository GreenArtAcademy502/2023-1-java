package com.green.java.ch04;


public class FlowEx17Method {
    public static void main(String[] args) {
        int star = 5;

        printStarLine(star); //*****(개행)
        printStarLine(3); //***(개행)
        printStarLine(11);
        System.out.println("---------");
        printStarRect(4);
        System.out.println("---------");
        printStarTri(4);
        //*
        //**
        //***
        //****
    }

    public static void printStarTri(int star) {
        for(int i=1; i<=star; i++) {
            printStarLine(i);
        }
    }
    public static void printStarRect(int star) {
        for(int i=0; i<star; i++) {
            printStarLine(star);
        }
    }
    public static void printStarLine(int star) {
        for(int i=0; i<star; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
