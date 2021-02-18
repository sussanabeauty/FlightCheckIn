package org.sussanacode.model;

public class Passenger {
    String passengerNumber, fullName, seatLocation;



    public void setPassengerNumber(String passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSeatLocation(String seatLocation) {
        this.seatLocation = seatLocation;
    }

    public String getPassengerNumber() {
        return passengerNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getSeatLocation() {
        return seatLocation;
    }
    public Passenger(){
        this.passengerNumber = "0000";
        this.fullName = "Default name";
        this.seatLocation = "default";
    }
    public Passenger(String passengerNumber, String fullName, String seatLocation) {
        this.passengerNumber = passengerNumber;
        this.fullName = fullName;
        this.seatLocation = seatLocation;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerNumber='" + passengerNumber + '\'' +
                ", fullName='" + fullName + '\'' +
                ", seatLocation='" + seatLocation + '\'' +
                '}';
    }
}
