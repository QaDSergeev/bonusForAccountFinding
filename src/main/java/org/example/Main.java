package org.example;

public class Main {

    public static void main(String[] args) {

        clientAccountFunding(100);
        clientAccountFunding(1560);
    }

    private static void clientAccountFunding(int accountFindingSum){

        int balance = 100;
        int bonusCount = 0;
        int bonusPrice = 100;

        balance += accountFindingSum;

        if (accountFindingSum > bonusPrice){

            bonusCount += accountFindingSum / bonusPrice;
        }

        balance += bonusCount;

        System.out.printf("%nПополнение: %s руб.%nБаланс: %s руб.%nНачислено бонусов: %s руб.%n", accountFindingSum, balance, bonusCount);
    }
}