package com.green.java.ch14;

public class MyArrayListTest2 {
    public static void main(String[] args) {
        MyArrayList mList = new MyArrayList();

        for(int i=100; i<=200; i++) {
            mList.add(i);
        }
        System.out.println(mList);

        //forEach를 통하여 mList가 가지고 있는 모든 값을 더하세요.
        //테스트로 잘 더했는지 출력.
        final IntBox ib = new IntBox();
        mList.forEach(item -> ib.plus(item));
        int sum = ib.getSum();
        System.out.println("sum : " + sum);

        //mList의 짝수만 전부 더해서 출력.
        final IntBox ib2 = new IntBox();
        mList.forEach(item -> {
            if(item % 2 == 0) {
                ib2.plus(item);
            }
        });
        System.out.println("짝수 sum : " + ib2.getSum());


        //전체 숫자 더할껀데 짝수만 * 2해서 더하기
        final IntBox ib3 = new IntBox();
        mList.forEach(item -> {
            ib3.plus(item % 2 == 0 ? item * 2 : item);
        });
    }
}

class IntBox {
    private int sum;
    public void plus(int num) {
        this.sum += num;
    }
    public int getSum() {
        return sum;
    }
}
