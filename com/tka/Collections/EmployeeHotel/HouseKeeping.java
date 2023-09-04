package com.tka.collections.EmployeeHotel;


public class HouseKeeping extends Employee{

    public HouseKeeping(int id, String name) {
        super(id, name);
    }

    public void cleanRoom() {
        System.out.println("Housekeeping " + super.getName() + " is cleaning rooms.");

    }

}
