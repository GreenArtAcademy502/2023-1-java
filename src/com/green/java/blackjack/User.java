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

}
