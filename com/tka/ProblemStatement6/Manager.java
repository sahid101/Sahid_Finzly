package com.tka.ProblemStatement6;

public class Manager extends Employee {
    private String department;

    public Manager(int id,String name,String department) {
        super(id,name);
        this.department = department;
    }

    @Override
    public String toString() {

        return super.toString() + " Manager{" +
                "department='" + department + '\'' +
                '}';
    }
}

