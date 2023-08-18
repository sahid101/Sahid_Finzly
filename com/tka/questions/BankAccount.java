package com.tka.questions;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String ownerName;

    public BankAccount(int accountNumber, int balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(int amount){
        this.balance += amount;
    }
    public void withdrawal(int amount){
        if(balance >= amount) {
            System.out.println("Successful Transaction");
            this.balance -= amount;
        }
        else {
            System.out.println("Low Balance.");
        }
    }

    public static void main(String[] args) {
        BankAccount sk = new BankAccount(123,10000,"Saran");
        System.out.println("Name : "+sk.getOwnerName()+"\nAccount number: "+sk.getAccountNumber());
        sk.deposit(200);
        System.out.println(sk.getBalance());
        sk.withdrawal(1000);
        System.out.println(sk.getBalance());

    }
}
