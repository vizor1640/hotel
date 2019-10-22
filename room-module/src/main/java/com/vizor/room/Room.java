package com.vizor.room;

public class Room {
    private final int roomNumber;
    private final RoomStyle roomStyle;
    private final RoomStatus roomStatus;
    private double price;
    private boolean isAvailable;

    public Room(final int roomNumber, final RoomStyle roomStyle, final RoomStatus roomStatus) {
        this.roomNumber = roomNumber;
        this.roomStyle = roomStyle;
        this.roomStatus = roomStatus;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomStyle getRoomStyle() {
        return roomStyle;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
