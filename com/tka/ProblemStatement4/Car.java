package com.tka.ProblemStatement4;


class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Engine Starts !");
    }

    @Override
    public void accelerate() {
        System.out.println("Applying Acceleration !");
    }

    @Override
    public void brake() {
        System.out.println("Applying Brakes !");
    }
}
class Motorcycle implements Vehicle{

    @Override
    public void start() {
        System.out.println("Engine Starts !");
    }

    @Override
    public void accelerate() {
        System.out.println("Applying Acceleration !");
    }

    @Override
    public void brake() {
        System.out.println("Applying Brakes !");
    }
}
