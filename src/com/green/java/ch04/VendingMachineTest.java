package com.green.java.ch04;

public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.insert(10000);
        vm.insert(10000);
        vm.insert(10000);
        vm.insert(10000);

        vm.showMenus();
        vm.purchaseDrink(1);
        vm.purchaseDrink(1);
        vm.purchaseDrink(2);
        //콜라를 구매하였습니다. (money값은 -1000처리)

        /*
        번호 \t 메뉴명 \t 가격
        1. \t 콜라 \t 1,000원
        2. \t 사이다 \t 1,500원
        3. \t 환타 \t 2,000원
        4. \t 미란다 \t 2,500원
         */

        vm.showMoney(); //현재 잔액은 38,000원입니다.

    }
}
