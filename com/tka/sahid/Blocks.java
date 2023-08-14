package com.tka.sahid;

public class Blocks {
    void show(String p){
        System.out.println(111);
    }
    void show(Object p){
        System.out.println(222);
    }
    public static void main(String[] args) {
        Blocks b = new Blocks();
        b.show(null);        //111
        b.show(new Blocks());   //222
        b.show((Object) null);  //222
    }
}