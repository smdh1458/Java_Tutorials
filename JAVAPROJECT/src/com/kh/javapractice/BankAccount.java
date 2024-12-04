package com.kh.javapractice;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if(balance < amount) {
            System.out.println("Insufficient funds");
        }else {
            this.balance -= amount;
        }

    }
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
