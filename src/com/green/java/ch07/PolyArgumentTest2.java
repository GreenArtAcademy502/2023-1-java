package com.green.java.ch07;

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer3 b = new Buyer3();
        b.buy(new Tv3());
        b.buy(new Tv3());
        b.summary();
        // 구입하신 제품은 Tv, Computer, Audio, Audio 총 4개 입니다.
    }
}

class Buyer3 {
    private int money;
    private int bonusPoint;
    private Product3[] items;
    private int idx;

    public Buyer3() {
        this.money = 1000;
        this.bonusPoint = 0;
        this.items = new Product3[10];
        this.idx = 0;
        printState();
    }

    public void buy(Product3 p) {
        items[idx++] = p;
        money = money - p.getPrice();
        bonusPoint = bonusPoint + p.getBonusPoint();
        System.out.printf("%s을(를) %,d만원에 구매하였습니다.\n", p, p.getPrice());
    }

    public void printState() {
        System.out.printf(
                "나의 현재 돈은 %,d만원 입니다. 현재 보너스 점수는 %,d점 입니다.\n"
                , money, bonusPoint
        );
    }

    public void summary() {
        System.out.print("구입하신 제품은");
        if(idx > 0) {
            System.out.printf(" %s", items[0]);
            for (int i = 1; i < idx; i++) {
                System.out.printf(", %s", items[i]);
            }
        }
        System.out.printf(" 총 %,d개 입니다.", idx);
    }

}

class Product3 {
    protected int price;
    protected int bonusPoint;

    Product3(int price) {
        this.price = price;
        this.bonusPoint = (int)(price * 0.1);
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

}
class Computer3 extends Product3 {
    public Computer3() {
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}

class Tv3 extends Product3 {
    public Tv3() {
        super(100);
    }
    public String toString() {
        return "Tv";
    }
}

class Audio3 extends Product3 {
    public Audio3() { super(50); }
    public String toString() { return "Audio"; }
}