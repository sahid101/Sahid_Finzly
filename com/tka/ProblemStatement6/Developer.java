package com.tka.ProblemStatement6;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(int id, String name, String programmingLanguage) {
        super(id, name);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {

        return super.toString() + " Developer{" +
                "language='" + programmingLanguage + '\'' +
                '}';
    }
}