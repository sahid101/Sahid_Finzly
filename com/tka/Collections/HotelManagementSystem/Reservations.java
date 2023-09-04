package com.tka.collections.HotelManagementSystem;

class Reservations {
    private int reservationId;
    private double price;
    private int days;

    public Reservations(int reservationId, double price, int days) {
        this.reservationId = reservationId;
        this.price = price;
        this.days = days;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Reservations{" +
                "reservationId=" + reservationId +
                ", price=" + price +
                ", days=" + days +
                '}';
    }
}
class RoomReservation extends Reservations{
    private int roomNo;
    public RoomReservation(int reservationId, double price, int days, int roomNo) {
        super(reservationId, price, days);
        this.roomNo = roomNo;
    }

    public int getRoomNo() {
        return roomNo;
    }

    @Override
    public String toString() {
        return super.toString()+"\nRoom Number=" + roomNo;
    }
}
class EventHall extends Reservations{
     private String eventName;

    public EventHall(int reservationId, double price, int days, String eventName) {
        super(reservationId, price, days);
        this.eventName = eventName;
    }

    @Override
    public String toString() {
        return  super.toString()+" eventName=" + eventName;
    }
}
class SpaService extends Reservations{
    private String serviceName;

    public SpaService(int reservationId, double price, int days, String serviceName) {
        super(reservationId, price, days);
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return super.toString()+ " serviceName= " + serviceName;
    }
}
