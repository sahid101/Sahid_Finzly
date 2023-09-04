package com.tka.collections.EmployeeHotel;


public class FrontDesk extends Employee{

    public FrontDesk(int id, String name) {
        super(id, name);
    }

    public void checkInGuests() {
        System.out.println("Front Desk " + super.getName() + " is checking in guests.");

    }

}
