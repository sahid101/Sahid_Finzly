package com.tka.ProblemStatement3;

public class Triangle implements Shape {

    private double sideA,sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter()/2;
        return Math.sqrt(s*(s - sideA)*(s - sideB)*(s - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return (sideA+sideB+sideC);
    }
}
