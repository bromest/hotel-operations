package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numOfNights;
    private boolean weekend;
    private double reservationTotal;

    public Reservation(String roomType, double price, int numOfNights, boolean weekend, double reservationTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numOfNights = numOfNights;
        this.weekend = weekend;
        this.reservationTotal = reservationTotal;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getPrice() {
        return price;
    }

    public double getReservationTotal() {
        return reservationTotal;
    }
}
