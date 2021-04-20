package com.drronidz;/*
    CREATED BY : ABD EL HALIM
    PROJECT NAME : {IntelliJ IDEA}
    CREATED ON : 4/20/2021 , 
    CREATED ON : 11:44 PM
*/

public class Main {
    public static void main(String[] args) {
        Account account = new Account("John");
        account.deposit(1000);
        account.withDraw(500);
        account.withDraw(-200);
        account.deposit(-500);
        account.calculateBalance();

        account.balance = 7000;
        System.out.println("Balance on account is " + account.getBalance());
    }
}
