package com.tka.questions;

import java.util.Scanner;

public class Antivirus {
    final int productKey = (int)(Math.random()*10000)+1;
    Scanner sc = new Scanner(System.in);
    Antivirus(){
        System.out.println("Free !!!");
    }
    Antivirus(Transaction obj){
        boolean t = sc.nextBoolean();
        if(obj.trans(t)){
            System.out.println(productKey);
        }
        else {
            System.out.println("Activate your AV!!");
        }
    }

    public static void main(String[] args) {
        Antivirus a = new Antivirus();
        Antivirus a1 = new Antivirus(new Transaction());
    }
}


