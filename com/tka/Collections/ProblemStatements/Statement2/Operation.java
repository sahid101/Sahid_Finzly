package com.tka.collections.ProblemStatements.Statement2;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Operation {
    static HashSet<Customer> Sbi = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while(b){
            System.out.println("1.Create Account\n2.Deposit\n3.Withdraw\n4.Check Balance\n5.All Account\n");
            int choice = sc.nextInt();
            switch(choice){
                case 1: createAccount(sc);
                    break;
                case 2: deposit(sc);
                    break;
                case 3: withdraw(sc);
                    break;
                case 4: checkBalance(sc);
                    break;
                case 5: listAll();
                    break;
                default:
                    System.out.println("Thank you !");
                    b = false;
            }
        }
    }
    static void createAccount(Scanner sc){
        System.out.println("Enter Name: ");
        String name = sc.next();
        System.out.println("Enter Balance: ");
        double balance = sc.nextDouble();

        Customer c = new Customer(name,balance);
        Sbi.add(c);
        System.out.println(c);
    }
    static void deposit(Scanner sc){
        boolean  found = false;
        System.out.println("Enter Account Number to deposit: ");
        String accountNo = sc.next();
        for (Customer c:Sbi) {
            if(Objects.equals(c.getAccountNo(), accountNo)){
                System.out.println("Amount to deposit.");
                double amount = sc.nextDouble();
                c.setBalance(c.getBalance()+amount);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Account Not Found.");
        }
    }
    static void withdraw(Scanner sc){
        boolean found = false;
        System.out.println("Enter Account No. to Withdraw.");
        String accountNo = sc.next();
        for (Customer c:Sbi) {
            if (Objects.equals(c.getAccountNo(), accountNo)){
                found = true;
                System.out.println("Amount to Withdraw.");
                double amount = sc.nextDouble();

                if(c.getBalance() <= amount){
                    System.out.println("Insufficient balance.");
                    break;
                }
                else{
                    c.setBalance(c.getBalance()-amount);
                }
            }
        }
        if(!found){
            System.out.println("Account Not found.");
        }
    }
    static void checkBalance(Scanner sc){
        System.out.println("Enter Account number to check balance.");
        String accountNo = sc.next();
        boolean found = false;
        for (Customer c:Sbi) {
            if(Objects.equals(c.getAccountNo(), accountNo)){
                System.out.println("Account Balance: "+c.getBalance());
                found = true;
            }
        }
        if(!found){
            System.out.println("Not Found.");
        }
    }
    static void listAll(){
        for (Customer c:Sbi) {
            System.out.println(c);
        }
    }
}
