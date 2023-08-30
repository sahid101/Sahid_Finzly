package com.tka.collections.ProblemStatements.Statement4;

public class Patient {
    private String name;
    private int age;
    private String issue;

    public Patient() {
    }

    public Patient(String name, int age, String issue) {
        this.name = name;
        this.age = age;
        this.issue = issue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", issue='" + issue + '\'' +
                '}';
    }
}
