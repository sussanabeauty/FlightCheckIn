package org.sussanacode.model;//import java.util.ArrayList;
//import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    String destination, departure, arrival;
    List<Passenger> passengerList = new ArrayList<>();

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public Flight() {
        this.destination = "Default";
        this.departure = "Default";
        this.arrival = "Default";
    }
    public Flight(String destination, String departure, String arrival, List<Passenger> passengerList) {
        this.destination = destination;
        this.departure = departure;
        this.arrival = arrival;
        this.passengerList = passengerList;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "destination='" + destination + '\'' +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", passengerList=" + passengerList +
                '}';
    }
}
