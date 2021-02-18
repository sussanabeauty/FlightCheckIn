package org.sussanacode;

import com.google.gson.Gson;
import org.sussanacode.model.Flight;
import org.sussanacode.model.Passenger;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class PassengerInput {

    public static void main(String[] args) throws FileNotFoundException {
        List<Passenger> passengerList = new ArrayList<>();
        String passengerNumber, fullName, seatLocation, destination, departure, arrival;;
        Scanner consoleScanner = new Scanner(System.in);
        consoleScanner.useDelimiter(System.getProperty("line.separator"));
        boolean loop = true;
        int ctrPass = 0;
        System.out.print("Enter Flight Information:\nEnter Flight Destination:");
        destination = consoleScanner.nextLine();
        System.out.print("Enter flight departure: ");
        departure = consoleScanner.nextLine();
        System.out.print("Enter flight arrival: ");
        arrival = consoleScanner.nextLine();
        System.out.print("Enter Passenger Information:");
        while (loop){
            System.out.println("Enter 'x' to Exit or space to continue:");
            if (consoleScanner.nextLine().equals("x")){
                loop = false;
            }
            if (loop){
                System.out.print("Enter passenger number: ");
                passengerNumber = consoleScanner.nextLine();
                System.out.print("Enter passenger name: ");
                fullName = consoleScanner.nextLine();
                System.out.print("Enter passenger seat location: ");
                seatLocation = consoleScanner.nextLine();
                Passenger p = new Passenger(passengerNumber,fullName,seatLocation);
                passengerList.add(p);
                ctrPass ++;
            }
            else{
                System.out.println("Input Terminated\nTotal Passengers: " + ctrPass);
            }
        }
        Flight flight = new Flight(destination,departure,arrival,passengerList);

        String jsonString = "{\"flight\":";
        jsonString += new Gson().toJson(passengerList);
        jsonString+= "}";

        Formatter output = new Formatter("flight.json");
        output.format("%s", jsonString);
        output.close();

    }
}
