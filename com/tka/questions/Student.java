package com.tka.questions;

class Student {
    private int studentId;
    private String name;
    private static int totalStudent;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }
    public int enroll(int numberOfStu){
        return (totalStudent += numberOfStu);
    }
    public int drop(int numberOfStu){
        if(numberOfStu <= totalStudent){
          return (totalStudent -= numberOfStu);
        }
        else
        {
            return totalStudent;
        }
    }

    public static void main(String[] args) {
        Student school = new Student(123,"Sashi");
        Student school2 = new Student(132,"sahid");

        System.out.println("After Enrolling Number of Student: "+school.enroll(100));
        System.out.println("After dropping Student no. :  "+school.drop(20));

        System.out.println("After Enrolling Number of Student: "+school2.enroll(100));
        System.out.println("After dropping Student no. :  "+school2.drop(20));

    }
}
