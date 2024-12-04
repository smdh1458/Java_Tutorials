package com.kh.javapractice;

public class BankAccountRun {
    public static void  main(String[] args) {
        //                                                       계좌번호       현재잔액
        BankAccount account = new BankAccount("123-456",1000);
        account.deposit(10000.00);
        account.withdraw(5000);
        account.withdraw(15000);
        System.out.println(account.toString());
    }
}
