package com.green.java.blackjack;

public class Test {
    public static void main(String[] args) {


        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();


        dealer.receiveCard(new Card("", "Q"));
        dealer.receiveCard(new Card("", "Q"));
        dealer.receiveCard(new Card("", "2"));

        gamer.receiveCard(new Card("", "A"));
        gamer.receiveCard(new Card("", "4"));


        Rule.whoIsWin(gamer, dealer);
    }
}
