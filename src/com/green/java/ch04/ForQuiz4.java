package com.green.java.ch04;

//____*
//___**
//  ***
// ****
//*****
public class ForQuiz4 {
    public static void main(String[] args) {
        int star = 5;

        for(int i=star; i>0; i--) {
            for(int z=1; z<=star; z++) {
                if(z < i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


        System.out.println("-------------");
        for(int i=1; i<=star ; i++) {
            for(int z=star; i<z; z--) {
                System.out.print("_");
            }
            for(int z=0; z<i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
