package com.green.java.blackjack;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public abstract class User {

    private List<Card> cardList;

    public User() {
        cardList = new ArrayList();
    }

    public void receiveCard(Card c) {
        cardList.add(c);
    }

    public List<Card> openCards() {
        return cardList;
    }

    protected int getPointSum() {
        return Rule.getScore(cardList);
    }

    public void showCards() {
        System.out.println("[ 현재 보유 카드 목록 ]");
        for(Card c : cardList) {
            System.out.println(c);
        }
        /*
        [ 현재 보유 카드 목록 ]
        Card { ♠, 10 }
        Card { ♠, 5 }
        Card { ♠, 2 }
         */
    }

}
