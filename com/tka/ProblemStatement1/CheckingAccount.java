package com.tka.ProblemStatement1;

public class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public int getAccountNumber() {
        return super.accountNumber;
    }

    @Override
    public String getAccountHolderName() {
        return super.accountHolderName;
    }

    @Override
    public double getBalance() {
        return super.balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            super.balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }
    @Override
    public void withdraw(double amount) {
        double minBalance = this.overdraftLimit;
        if (super.balance - amount >= minBalance) {
            super.balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
        System.out.println("Balance is " + super.balance);
    }
}
