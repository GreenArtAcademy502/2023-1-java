package com.green.java.ch04.vendingmachine;

public class VendingMachineObjTest {
    public static void main(String[] args) {
        VendingMachineObj vm = new VendingMachineObj();
        vm.insert(10_000);
        vm.insert(10_000);
        vm.insert(10_000);

        vm.showMenus();
        vm.purchaseDrink(1); //콜라을(를) 구매하였습니다. (money값은 -1000처리)
        vm.purchaseDrink(2); //사이다을(를) 구매하였습니다. (money값은 -1500처리)

         /*
        번호 \t 메뉴명 \t 가격 \t 회사 \t 용량
        1. \t 콜라 \t 1,000원 \t 코카콜라 \t 500ml
        2. \t 사이다 \t 1,500원 \t 칠성  \t 450ml
        3. \t 환타 \t 2,000원  \t 코카콜라 \t 500ml
         */
        vm.showMoney();
    }
}
