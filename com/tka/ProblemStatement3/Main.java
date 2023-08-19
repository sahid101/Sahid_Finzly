package com.tka.ProblemStatement3;

/**
 *  Implementing Polymorphism in Java
 */
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Circle c = new Circle(23);
        Rectangle r = new Rectangle(12,23);
        Triangle t = new Triangle(12,12,23);
        
        shapes[0]=c;
        shapes[1]=r;
        shapes[2]=t;
        for (Shape s: shapes) {
            System.out.println("Class Name: "+s.getClass().getSimpleName());
            System.out.println("Area: "+s.calculateArea());
            System.out.println("Perimeter: "+s.calculatePerimeter());
            System.out.println();
        }
    }
}
