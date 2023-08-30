package com.tka.collections.ProblemStatements.Statement3;

public class Student {
    private String name;
    private int rollNo;
    private int standard;
    private static int tempNo = 0;

    public Student() {
    }

    public Student(String name, int standard) {
        this.name = name;
        this.rollNo = ++tempNo;
        this.standard = standard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", standard=" + standard +
                '}';
    }
}
