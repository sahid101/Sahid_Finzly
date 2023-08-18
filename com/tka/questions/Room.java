package com.tka.questions;

import java.util.Date;

public class Room {
    private int roomNumber;
    private static int capacity = 100;
    private int pricePerNight;
    private boolean isReserved = false;

    Room(int roomNumber, int pricePerNight) {
        capacity -= 1;
        this.roomNumber = roomNumber;
        this.pricePerNight = pricePerNight;
    }

    public int getCapacity() {
        return capacity;
    }

//    public void setCapacity(int capacity) {
//        this.capacity = capacity;
//    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    @Override
    public String toString() {
        return "Room: " +
                "roomNumber=" + roomNumber +
                ", pricePerNight=" + pricePerNight +
                ' ';
    }
    public void reservation() {
        if (!isReserved || capacity == 0) {
            isReserved = true;
            System.out.println("Reservation without Dates..");
            System.out.println("Done.");
        }
        else {
            System.out.println("Reserved Room.!!");
        }
    }
    public void reservation(Date checkIn, Date checkOut){
        if(isReserved || capacity == 0){
            isReserved = true;
            System.out.println("Reservation with Date: "+checkIn+" till "+checkOut);
        }
        else {
            System.out.println("Not Available.");
        }
    }

    public static void main(String[] args) {

        Room room = new Room(123,1000);
        Room room2 = new Room(122,1200);

        //room
        System.out.println(room.isReserved);
        room.reservation();
        room.reservation(new Date(),new Date());
        System.out.println(room);
        System.out.println(room.getCapacity());

        //room2
        System.out.println(room2.isReserved);
        room2.reservation();
        room2.reservation(new Date(),new Date());
        System.out.println(room2);
        System.out.println(room2.getCapacity());
    }

}
