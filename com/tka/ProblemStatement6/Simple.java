package com.tka.ProblemStatement6;

/**
 * Building an Inheritance-based Employee System in Java
 */
public class Simple {
    public static void main(String[] args) {
        Manager m = new Manager(1,"loru","CSE");
        System.out.println(m.toString());
        Developer d = new Developer(1,"loru","bhai lang");
        System.out.println(d.toString());
    }
}
