package com.tka.collections.HotelManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int roomNo;
    private String roomType;
    private boolean isAvailable;

    public Room(int roomNo, String roomType) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.isAvailable = true;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public void reserve() {
        isAvailable = false;
    }

    public void release() {
        isAvailable = true;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
class RoomManage{
    private List<Room> rooms;
    public RoomManage(){
        rooms = new ArrayList<>();
        //deluxe room
        String type = "Deluxe";
        for (int i = 0; i < 5; i++) {
            rooms.add(new Room(100+i,type));
        }
        //standard room
        type = "Standard";
//        for (int i = 5; i < 10; i++) {
//            rooms.add(new Room(100+i,type));
//        }
        //suite room
        type = "Suite";
        for (int i = 10; i < 15; i++) {
            rooms.add(new Room(100+i,type));
        }
    }
    public Room findAvailableRoom(String roomType) throws RoomNotFoundException{
        for (Room room: rooms) {
            if(room.getRoomType().equalsIgnoreCase(roomType) && room.isAvailable()){
                return room;
            }
        }
        throw new RoomNotFoundException("No Available "+roomType+"room found.");
    }
}
