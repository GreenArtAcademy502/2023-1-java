package com.green.java.test;

public class NumTest {
    public static void main(String[] args) {
        int num = 10;
        changeNum(num);
        System.out.println("num: " + num);

        Numbox nb = new Numbox();
        System.out.println("1 - nb.getNum(): " + nb.getNum());
        changeNum(nb);
        System.out.println("2 - nb.getNum(): " + nb.getNum());
        return;
    }

    private static void changeNum(int num) {
        num = 30;
        return;
    }

    private static void changeNum(Numbox box) {
        box.setNum(30);
        return;
    }
}

class Numbox{
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
