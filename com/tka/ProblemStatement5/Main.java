package com.tka.ProblemStatement5;

/**
 *  Exploring Constructors in Java
 */
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student sahid = new Student("Sahid",23,24);
        Student sameer = new Student("Sameer",82);

        student1.setName("Rahul");
        student1.setAge(22);
        System.out.println(student1);
        System.out.println(sahid);
        System.out.println(sameer);
    }
}
