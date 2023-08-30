package com.tka.collections.ProblemStatements.Statement3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Student> studentsRecord = new ArrayList<>();
    static List<Teacher> teachersRecord = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while (b){
            System.out.println("1.Add a student.\n2.Add a Teacher.\n3.Display details.\n4.Exit.");
            int choice = sc.nextInt();

            switch (choice){
                case 1: addStudent(sc);
                        break;
                case 2: addTeacher(sc);
                        break;
                case 3:
                    System.out.println("1.Students details\n2.Teachers details.");
                    int decision = sc.nextInt();
                    if(decision == 1){
                        displayStudents();
                    }
                    else if(decision == 2){
                        displayTeachers();
                    }
                    else {
                        System.out.println("Invalid Option.");
                    }
                    break;
                default:
                    System.out.println("Thank you");
                    b = false;
                    break;
            }
        }
    }
    static void addStudent(Scanner sc){
        System.out.println("Enter Name:");
        String name = sc.next();

        System.out.println("Enter Class:");
        int standard = sc.nextInt();
        Student s = new Student(name,standard);
        studentsRecord.add(s);
        System.out.println("Roll number allocated: "+s.getRollNo());
    }
    static void addTeacher(Scanner sc){
        System.out.println("Enter Name:");
        String name = sc.next();

        System.out.println("Enter Subject:");
        String subject = sc.next();
        Teacher t = new Teacher(name,subject);
        teachersRecord.add(t);
    }
    static void displayStudents(){
        for (Student s:studentsRecord) {
            System.out.println(s);
        }
    }
    static void displayTeachers(){
        for (Teacher t:teachersRecord) {
            System.out.println(t);
        }
    }
}

