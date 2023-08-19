package com.tka.ProblemStatement3;

public class Circle implements Shape{

    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI*2*this.radius;
    }
}
