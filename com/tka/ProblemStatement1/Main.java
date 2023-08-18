package com.tka.ProblemStatement1;

public class Main {
    public static void main(String[] args) {
        SavingsAccount sahid = new SavingsAccount(2220,"sahid",20000,10);
        CheckingAccount sashi = new CheckingAccount(2122,"Sashi",1200,100);

        sahid.deposit(2000);
        sashi.deposit(3000);

        sahid.amountAfterInterest();

        sahid.withdraw(2000);
        sashi.withdraw(1000);
    }
}
