package com.green.java.ch02;

public class VariableEquals {
    public static void main(String[] args) {
        NumberBox nb1 = new NumberBox(10);
        NumberBox nb2 = new NumberBox(10);

        boolean r1 = (nb1 == nb2); //false
        System.out.println("r1 : " + r1);
        boolean r2 = nb1.equals(nb2);
        System.out.println("r2 : " + r2);
    }
}

class NumberBox extends Object {
    private int num;
    NumberBox(int num) {
        this.num = num;
    }
    int getNum() {
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof NumberBox)) {
            return false;
        }
        NumberBox nb = (NumberBox)obj;
        return this.num == nb.num;
    }
}
