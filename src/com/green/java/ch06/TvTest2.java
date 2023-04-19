package com.green.java.ch06;

/*
    channelUp 메소드를 아무리 호출을 하여도
    channel값이 5 초과가 되지 않게 작업
 */
public class TvTest2 {
    public static void main(String[] args) {
        Tv2 tv = new Tv2();

        for(int i=0; i<10; i++) {
            tv.channelUp();
        }
        System.out.printf("channel : %d\n", tv.channel);

        for(int i=0; i<10; i++) {
            tv.channelDown();
        }
        System.out.printf("channel : %d\n", tv.channel);
    }
}

class Tv2 {
    String color;
    boolean power;
    int channel;
    final int MAX_CHANNEL = 5;
    final int MIN_CHANNEL = 1;

    void power() { power = !power; }
    void channelUp() {
        if(channel < MAX_CHANNEL){
            ++channel;
        }
    }
    void channelDown() {
        if(channel > MIN_CHANNEL) {
            --channel;
        }
    }
}
