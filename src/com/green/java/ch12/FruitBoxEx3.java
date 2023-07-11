package com.green.java.ch12;

import java.util.ArrayList;
import java.util.List;

public class FruitBoxEx3 {
    public static void main(String[] args) {
        Box4<Fruit3> fruitBox = new Box4();
        fruitBox.add(new Fruit3());
        fruitBox.add(new Apple3());
        fruitBox.add(new Grape3());
        Juicer.makejuice(fruitBox);

        Box4<Toy3> toyBox = new Box4();
        //Juicer.makejuice(toyBox);
    }
}
class Juicer {
    public static Juice makejuice(Box4<? extends Fruit3> box) {
        return null;
    }
}

class Juice {
    private String name;
    public Juice(String name) {
        this.name = name + "주스";
    }
    public String toString() { return name; }
}

class Fruit3 { public String toString() { return "Fruit"; } }
class Apple3 extends Fruit3 { public String toString() { return "Apple"; } }
class Grape3 extends Fruit3 { public String toString() { return "Grape"; } }
class Toy3 { public String toString() { return "Toy"; } };

class FruitBox3<T extends Fruit3> extends Box4<T> {}

class Box4<T> {
    private List<T> list = new ArrayList();
    public void add(T item) { list.add(item); }
    public T get(int idx) { return list.get(idx); }
    public int size() { return list.size(); }
    public String toString() { return list.toString(); }
}
