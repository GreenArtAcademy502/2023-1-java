package com.green.java.blackjack;

import java.util.List;

public class BlackjackTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        Rule rule = new Rule();


        gamer.receiveCard(cd.getCard());
        gamer.receiveCard(cd.getCard());

        dealer.receiveCard(cd.getCard());
        dealer.receiveCard(cd.getCard());

        System.out.println("-----------");
        for(Card c : gamer.openCards()) {
            System.out.println(c.getDenomination());
        }
        System.out.println("-----------");
        int gamerScore = rule.getScore(gamer.openCards());
        System.out.println("gameScore : " + gamerScore);
        int dealerScore = rule.getScore(dealer.openCards());

    }
}
