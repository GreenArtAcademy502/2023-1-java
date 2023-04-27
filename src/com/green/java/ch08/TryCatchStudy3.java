package com.green.java.ch08;

public class TryCatchStudy3 {
    public static void main(String[] args) {
        int r = div(10, 5);
        System.out.println("r : " + r);
    }
    
    public static int div(int n1, int n2) {
        int r = 0;
        try {
            r = n1 / n2;
            if (r % 2 == 0) {
                return 100;
            }
        } catch (ArithmeticException | NumberFormatException e2) {
            //multi catch block

        } catch (Exception e2) {

            e2.printStackTrace();
        } finally {
            System.out.println("파이널리");
        }
        System.out.println("끝!!");
        return r;
    }
    
}
