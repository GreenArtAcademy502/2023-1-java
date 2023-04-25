package com.green.java.ch07.cards;

import com.green.java.ch07.ModifierTest;

public class CardTest {
    public static void main(String[] args) {
        ModifierTest mt1 = new ModifierTest();
        //mt1.num1 = 10;
        //mt1.num2 = 20;
        //mt1.num3 = 30;
        mt1.num4 = 40;

        CardDeck cd = new CardDeck();
        cd.openCards();
        System.out.println("----");
        cd.shuffle();
        cd.openCards();
        System.out.println("----");

        for (int i = 0; i < cd.cards.length; i++) {
            cd.pick();
        }

        cd.pick();

        System.out.println("----");
        cd.openCards();
    }
}
