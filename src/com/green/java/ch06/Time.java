package com.green.java.ch06;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public void test() {
        int gg = 10;
    }
    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        if(hour > 0 && hour < 24) {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
