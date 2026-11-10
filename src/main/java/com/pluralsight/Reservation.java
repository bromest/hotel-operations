package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;
    private double reservationTotal;

    public Reservation(String roomType, int numOfNights, boolean weekend, double reservationTotal) {
        this.roomType = roomType;
        this.numberOfNights = numOfNights;
        this.weekend = weekend;
        this.reservationTotal = reservationTotal;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getPrice() {
        double price = 124;
        if (roomType.equalsIgnoreCase("king")) {
            price = 139 ;
        }
        if(isWeekend()){
            price = price * 1.1;
        }
        return price;
    }

    public double getReservationTotal() {
        return getPrice() * getNumberOfNights();
    }
}
