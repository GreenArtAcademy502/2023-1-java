package com.green.java.ch14;

public class CalculatableTest {
    public static void main(String[] args) {
        Calculatable cc = new Calculatable() {
            @Override
            public int calc(int n1, int n2) {
                return n1 + n2;
            }
        };

        int result = cc.calc(10, 20);
        System.out.println("result : " + result);

        Calculatable cc2 = (n1, n2) -> n1 + n2;
        int result2 = cc2.calc(20, 30);
        System.out.println("result2 : " + result2);

        Calculatable cc3 = (n1, n2) -> {
          return n1 + n2;
        };
        System.out.println("result3 : " + cc3.calc(100, 200));
    }
}
