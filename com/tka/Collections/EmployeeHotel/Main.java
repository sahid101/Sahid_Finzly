package com.tka.collections.EmployeeHotel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HotelManagement hotelManagement = new HotelManagement();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("1. Hire");
            System.out.println("2. Assign");
            System.out.println("3. Exit");

            int choice = -1;
            try {
                choice = scan.nextInt();
                scan.nextLine();
            }
            catch (InputMismatchException e) {
                scan.nextLine();
            }
            switch (choice) {
                case 1:
                    hire(scan, hotelManagement);
                    break;
                case 2:
                    assign(scan, hotelManagement);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-3).");
            }
        }





    }

    public static void hire(Scanner scan, HotelManagement hotelManagement) {
        System.out.println("Enter Category (FrontDesk, HouseKeeping, KitchenStaff, Maintenance) ");
        String category = scan.nextLine();

        System.out.println("Enter Name: ");
        String name = scan.nextLine();

        int id = -1;
        System.out.println("Enter ID: ");

        try {
            if (scan.hasNextInt()) {
                id = scan.nextInt();
                scan.nextLine();
            } else {
                throw new InputMismatchException("Invalid ID format. Please enter a valid integer.");
            }

            hotelManagement.hire(category, id, name);
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (DuplicateEmployeeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        hotelManagement.show();
    }


    public static void assign(Scanner scan, HotelManagement hotelManagement) {
        System.out.println("Enter Category (FrontDesk, HouseKeeping, KitchenStaff, Maintenance) ");
        String category = scan.nextLine();

        System.out.println("Enter Employee ID: ");

        int id = -1;
        try {
            if (scan.hasNextInt()) {
                id = scan.nextInt();
                scan.nextLine();
            } else {
                throw new InputMismatchException("Invalid Employee ID format. Please enter a valid integer.");
            }

            hotelManagement.assign(category, id);
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidTaskAssignmentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        hotelManagement.show();
    }


}