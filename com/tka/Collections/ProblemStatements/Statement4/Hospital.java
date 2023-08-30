package com.tka.collections.ProblemStatements.Statement4;

import java.util.HashMap;
import java.util.Scanner;

public class Hospital {
    static HashMap<Integer, Patient> hospital = new HashMap<>();
    static int tempId = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while (b){
            System.out.println("1.Add Patient.\n2.Search.\n3.Show All.\n4.Exit");
            int choice = sc.nextInt();
            switch (choice){
                case 1: addPatient(sc);
                    break;
                case 2: searchPatient(sc);
                    break;
                case 3: showAll();
                    break;
                case 4:
                    System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
                    b = false;
                    break;
            }
        }
    }
    static void addPatient(Scanner scanner){
        int id = ++tempId;
        System.out.println("Enter Patients Name: ");
        String name = scanner.next();

        System.out.println("Enter Patients Issue: ");
        String issue = scanner.next();

        System.out.println("Enter Age: ");
        int age = scanner.nextInt();

        Patient p = new Patient(name,age,issue);
        hospital.put(id,p);
        System.out.println("Your ID: "+id);
    }
    static void searchPatient(Scanner scanner){
        System.out.println("Provide ID of Patient: ");
        boolean found = false;
        int id = scanner.nextInt();
        for (Integer i:hospital.keySet()) {
            if(i.equals(id)) {
                System.out.println(hospital.get(i));
                found = true;
            }
        }
        if(!found){
            System.out.println("Patient Not Found.");
        }
    }
    static void showAll(){
        for (Integer key : hospital.keySet()) {
            System.out.println(hospital.get(key));
        }
    }
}
