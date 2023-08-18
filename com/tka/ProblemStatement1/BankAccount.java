package com.tka.ProblemStatement1;

public abstract class BankAccount {
        protected int accountNumber;
        protected String accountHolderName;
        protected double balance;

        public BankAccount(int accountNumber, String accountHolderName, double balance) {
                this.accountNumber = accountNumber;
                this.accountHolderName = accountHolderName;
                this.balance = balance;
        }

        public abstract int getAccountNumber();
        public abstract String getAccountHolderName();
        public abstract double getBalance();
        public abstract void deposit(double amount);
        public abstract void withdraw(double amount);

}
