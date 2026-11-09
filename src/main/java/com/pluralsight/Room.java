package com.pluralsight;

public class Room {
    private int roomNumber;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    public Room(int roomNumber, double price, boolean occupied, boolean dirty, boolean available) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.available = available;
    }
    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return available;
    }
}