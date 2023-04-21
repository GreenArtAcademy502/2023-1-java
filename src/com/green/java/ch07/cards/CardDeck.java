package com.green.java.ch07.cards;

public class CardDeck {
    Card[] cards;

    CardDeck() {
        cards = new Card[52];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = new Card("", "");
        }

    }
}
