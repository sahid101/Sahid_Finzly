package com.tka.collections.HotelManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Guests {
    private String name;
    private String aadhaarNo;
    private List<Reservations> reservations;
    Guests(){}
    Guests(String name, String aadhaarNo) {
        this.name = name;
        this.aadhaarNo = aadhaarNo;
        this.reservations = new ArrayList<>();
    }
    public void addReservation(Reservations r){
                reservations.add(r);
    }

    public String getName() {
        return name;
    }


    public void displayReservation(){
        System.out.println("Name: "+name+"\nAadhaar Number: "+aadhaarNo+"\n");
        System.out.println("Reservation: ");
        for (Reservations r:reservations) {
            System.out.println(r.toString());
        }
    }
}
