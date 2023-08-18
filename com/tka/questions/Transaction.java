package com.tka.questions;

public class Transaction {
    boolean t;
    boolean trans(boolean t){
        if(t){
            System.out.println("The Product Key is: ");
            return true;
        }
        else{
            System.out.println("Transaction not done try again !!");
            return false;
        }
    }

}
