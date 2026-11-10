package com.pluralsight;

public class Room {
    private int numberOfBed;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    public Room(int roomNumber, double price, boolean occupied, boolean dirty) {
        this.numberOfBed = roomNumber;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;

    }
    public int getNumberOfBed() {
        return numberOfBed;
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
        return !dirty && !occupied;
    }
}