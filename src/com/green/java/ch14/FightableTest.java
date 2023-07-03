package com.green.java.ch14;

public class FightableTest {

    public static void run(Fightable f) {
        f.punch();
    }

    public static void main(String[] args) {



        run(new Fightable() {
            @Override
            public void punch() {
                System.out.println("머리 박치기를 한다.");
            }
        });

        run(new Fightable() {
            @Override
            public void punch() {

            }
        });

        Fightable sf = new StreetFighter();
        run(sf);
        Fightable f1 = new Fightable() {
            @Override
            public void punch() {
                System.out.println("크크크크");
            }
        };
    }
}

class StreetFighter implements Fightable {
    @Override
    public void punch() {
        System.out.println("주먹을 날린다.");
    }
}