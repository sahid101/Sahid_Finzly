package com.tka.collections.ProblemStatements.Statement1;

public class Employee {
    private String name;
    private double salary;
    private int id;
    static int tempId = 0;

    Employee(){
    }
    Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
        this.id = ++tempId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
