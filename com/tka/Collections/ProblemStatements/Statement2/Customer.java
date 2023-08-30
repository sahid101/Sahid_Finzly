package com.tka.collections.ProblemStatements.Statement2;

public class Customer {
    private String name;
    private String accountNo;
    private double balance;
    private String bankIFSC = "PUNB-";
    private static  int tempAc = 0;
    Customer(){}

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.accountNo = bankIFSC + tempAc;
        tempAc++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", balance=" + balance +
                '}';
    }
}
