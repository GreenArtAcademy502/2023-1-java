package com.green.java.blackjack;

import java.util.List;
import java.util.Scanner;

public class BlackjackTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();

        for (int i = 0; i < 2; i++) {
            gamer.receiveCard(cd.getCard());
            dealer.receiveCard(cd.getCard());
        }

        if(dealer.isReceiveCard()) {
            dealer.receiveCard(cd.getCard());
        }
        gamer.showCards();

        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.print("Card More? (y/n) > ");
            String answer = scan.nextLine();
            if("n".equals(answer.trim().toLowerCase())) { break; }
            gamer.receiveCard(cd.getCard());
            gamer.showCards();
        }

        dealer.showCards();
        Rule.whoIsWin(gamer, dealer);
    }
}
