package com.tka.ProblemStatement6;
/**
 * Building an Inheritance-based Employee System in Java
 */
public class Simple {
    public static void main(String[] args) {
        Manager m = new Manager(1,"Sahid","CSE");
        System.out.println(m);
        Developer d = new Developer(12,"SAGAR","JAVA");
        System.out.println(d);
    }
}
