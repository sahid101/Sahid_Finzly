package com.tka.ProblemStatement1;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
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
    public void amountAfterInterest(){
        double totalAmount = (interestRate/100)+super.balance;
        super.balance = totalAmount;
        System.out.println("Balance of Saving A/c: Name: "+super.accountHolderName+"\nBalance: "+totalAmount);
    }

    @Override
    public void withdraw(double amount) {
        double minBalance = 100.0; // Minimum balance required for withdrawal
        if (super.balance - amount >= minBalance) {
            super.balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
        System.out.println("Balance is " + super.balance);
    }

}
