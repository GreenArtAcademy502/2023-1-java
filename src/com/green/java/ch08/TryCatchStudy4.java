package com.green.java.ch08;

public class TryCatchStudy4 {
    public static void main(String[] args) {
        int type = 1;
        try {
            System.out.println("ddd");
            if (type == 0) {
                throw new Exception("고의로 예외 발생");
            } else if (type == 1) {
                throw new ArithmeticException("dd");
            }
        } catch (ArithmeticException e) {
            System.out.println("arithmetic 에러 메시지 : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("끝!");
    }
}
