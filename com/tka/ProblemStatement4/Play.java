package com.tka.ProblemStatement4;

/**
 * Implementing Interfaces in Java for
 * Vehicles
 */
class Play{
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.accelerate();
        c.brake();

        Motorcycle m = new Motorcycle();
        m.start();
        m.accelerate();
        m.brake();
    }
}
