package com.green.java.ch06;


class NumberBox {
    int num;
}

//p.265 ~ 267
public class ParamsTest {
    public static void main(String[] args) {
        int num = 10;
        changeNum(num);
        System.out.println(num);//10

        NumberBox nb = new NumberBox();
        nb.num = 10;
        changeNum2(nb);
        System.out.println(nb.num);//20,


        NumberBox nb2 = new NumberBox();
        changeNum3(nb2);
        System.out.println("nb2.num : " + nb2.num);

        NumberBox nb3 = new NumberBox();
        NumberBox nb4 = changeNum4(nb3);

        System.out.println("nb3.num : " + nb3.num);
        System.out.println("nb4.num : " + nb4.num);
    }

    static void changeNum(int num) {
        num = 20;
    }

    static void changeNum2(NumberBox nb2) {
        nb2.num = 20;
    }

    static void changeNum3(NumberBox nb2) {
        nb2 = new NumberBox();
        nb2.num = 30;
        //return nb2;
    }

    static NumberBox changeNum4(NumberBox nb2) {
        nb2 = new NumberBox();
        nb2.num = 30;
        return nb2;
    }
}

