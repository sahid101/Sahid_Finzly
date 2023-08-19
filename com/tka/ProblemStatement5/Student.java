package com.tka.ProblemStatement5;

public class Student {
    private static int uniqueId = 101;
    private String name;
    private int age;
    private int studentId;

    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.studentId = uniqueId++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.studentId = uniqueId++;
    }

    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
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

    @Override
    public String toString() {
        return "Student: " +
                "name: '" + name + '\'' +
                ", age: " + age +
                ", studentId: " + studentId +
                '.';
    }
}
