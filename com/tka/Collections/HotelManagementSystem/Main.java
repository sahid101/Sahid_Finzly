package com.tka.collections.HotelManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RoomManage roomManage = new RoomManage();
        List<Guests> guests = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Make a reservation");
            System.out.println("2. Display guest reservations");
            System.out.println("3. Check room availability");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String guestName = scanner.nextLine();

                    System.out.print("Enter your Aadhaar: ");
                    String aadhaarNo = scanner.nextLine();
                    Guests guest = new Guests(guestName,aadhaarNo);
                    guests.add(guest);

                    System.out.println("Choose a reservation type:");
                    System.out.println("1. Room Reservation");
                    System.out.println("2. Event Hall Reservation");
                    System.out.println("3. Spa Service Reservation");
                    int reservationChoice = scanner.nextInt();
                    scanner.nextLine();

                    try {
                        switch (reservationChoice) {
                            case 1:
                                System.out.print("Enter room type (Standard/Deluxe/Suite): ");
                                String roomType = scanner.nextLine();
                                Room room = roomManage.findAvailableRoom(roomType);
                                room.reserve();

                                System.out.print("Enter reservation cost: ");
                                double cost = scanner.nextDouble();
                                scanner.nextLine();

                                System.out.println("Number of days.");
                                int days = scanner.nextInt();

                                RoomReservation roomReservation = new RoomReservation(123,cost,days, room.getRoomNo());
                                guest.addReservation(roomReservation);
                                System.out.println("Room reserved successfully.");
                                break;

                            default:
                                throw new InvalidReservationException();

                        }
                    } catch (RoomNotFoundException | InvalidReservationException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter your name ");
                    String name = scanner.next();
                    scanner.nextLine();  // Consume newline

                    for (Guests g : guests) {
                        if (g.getName().equalsIgnoreCase(name)) {
                            g.displayReservation();
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter room type to check availability: ");
                    String roomType = scanner.nextLine();

                    try {
                        Room availableRoom = roomManage.findAvailableRoom(roomType);
                        System.out.println("Available room: " + availableRoom.getRoomNo());
                    } catch (RoomNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
}
}
