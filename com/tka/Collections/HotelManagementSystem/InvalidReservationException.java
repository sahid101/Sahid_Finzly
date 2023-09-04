package com.tka.collections.HotelManagementSystem;

public class InvalidReservationException extends Exception {
    public InvalidReservationException(String str) {
        super(str);
    }

    public InvalidReservationException() {
        super();
    }
}
