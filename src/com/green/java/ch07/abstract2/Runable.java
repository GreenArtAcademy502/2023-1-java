package com.green.java.ch07.abstract2;

public interface Runable extends CanFly, Fightable {
    void run();
    void move(int x, int y);
}
