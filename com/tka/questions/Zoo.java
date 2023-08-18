package com.tka.questions;

class Animal {
    private String name;
    private int age;
    Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void makeSound(){
        System.out.println("Animal Sound  !!");
    }
}

class Lion extends Animal{
    Lion(String name, int age){
        super(name,age);
    }
    @Override
    public void makeSound(){
        System.out.println("Lions Sound  !!");
    }
}

class Elephant extends Animal{
    Elephant(String name, int age){
        super(name,age);
    }
    @Override
    public void makeSound(){
        System.out.println("Elephant Sound  !!");
    }
}

class Giraffe extends Animal{
    Giraffe(String name, int age){
        super(name,age);
    }
    @Override
    public void makeSound(){
        System.out.println("Giraffe Sound  !!");
    }
}

class Zoo{
    public static void main(String[] args) {
        Animal leo = new Lion("leo",21);
        Animal gif = new Giraffe("Gif", 22);
        Animal eli = new Elephant("eli",30);

        leo.makeSound();
        gif.makeSound();
        eli.makeSound();
    }
}