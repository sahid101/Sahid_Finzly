package com.tka.collections.ProblemStatements.Statement1;

import java.util.ArrayList;
import java.util.Scanner;

public class Operation {
    static ArrayList<Employee> infosys = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee suraj = new Employee("Suraj",20000);
        Employee rahul = new Employee("Rahul",30000);
        Employee dipti = new Employee("Dipti",15000);
        infosys.add(suraj);
        infosys.add(dipti);
        infosys.add(rahul);
        boolean b = true;
        while(b){
            System.out.println("1.Add Employee\n2.View details\n3.Search Employee\n");
            int choice = sc.nextInt();
            switch(choice){
                case 1: addEmployee(sc);
                        break;
                case 2: viewAllDetails();
                        break;
                case 3: searchEmployee(sc);
                        break;
                default:
                    System.out.println("Thank you !");
                    b = false;
            }
        }

    }

    static void addEmployee(Scanner sc){
        System.out.println("Enter new Employee's Name: ");
        String name = sc.next();

        System.out.println("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee e = new Employee(name,salary);
        infosys.add(e);
    }

    static void viewAllDetails(){
        for (Employee e:infosys) {
            System.out.println(e);
        }
    }
    static void  searchEmployee(Scanner sc){
        System.out.println("Enter id of Employee you are search for.");
        int id = sc.nextInt();
        boolean found = false;
        for (Employee e:infosys) {
            if(e.getId() == id){
                System.out.println(e);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("No Records Found.");
        }
    }
}
