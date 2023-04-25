package com.green.java.ch06;

class IntBox {
    int n;
}

public class ParamsTest2 {
    public static void main(String[] args) {
        IntBox ib1 = new IntBox();
        ib1.n = 11;

        IntBox ib2 = new IntBox();
        ib2.n = 22;

        ib1 = ib2;

        System.out.println("ib1.n : " + ib1.n);
        System.out.println("ib2.n : " + ib2.n);

        changeIntBox(ib1);
        System.out.println("ib1.n : " + ib1.n); //
        System.out.println("ib2.n : " + ib2.n); //
    }

    public static void changeIntBox(IntBox ib) {
        ib.n = 33;
    }
}
