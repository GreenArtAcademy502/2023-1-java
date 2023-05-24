package com.green.java.blackjack;

public class Dealer extends User {

    private final int CAN_RECEIVE_POINT = 16;

    public boolean isReceiveCard() {
        return getPointSum() <= CAN_RECEIVE_POINT;
    }

    @Override
    public void showCards() {
        System.out.println("-- 딜러 --");
        super.showCards();
    }
}
