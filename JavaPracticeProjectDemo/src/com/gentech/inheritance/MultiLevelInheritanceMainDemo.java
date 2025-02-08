package com.gentech.inheritance;
class Airport {
    int airportId;
    String airportName;

    Airport(int airportId, String airportName){
        this.airportId = airportId;
        this.airportName = airportName;
    }

    void displayAirportDetails(){
        System.out.println("Airport Id:"+airportId);
        System.out.println("Airport Name:"+airportName);
    }
}

class Airlines extends Airport {
    int airlineId;
    String airlineName;
    Airlines(int airportId, String airportName, int airlineId, String airlineName){
        super(airportId, airportName);
        this.airlineId = airlineId;
        this.airlineName = airlineName;
    }
    void displayAirlinesDetails(){
        System.out.println("Airlines Id:"+ airlineId);
        System.out.println("Airlines Name:"+airlineName);
    }
}

class Flight extends Airlines {
    int flightId;
    String flightName;
    Flight(int airportId, String airportName, int airlineId, String airlineName, int flightId, String flightName){
        super(airportId, airportName, airlineId, airlineName);
        this.flightId = flightId;
        this.flightName = flightName;
    }

    void displayFlightDetails(){
        System.out.println("Flight Id:"+flightId);
        System.out.println("Flight Name:"+flightName);
    }
}
public class MultiLevelInheritanceMainDemo {
    public static void main(String[] args) {
        Flight flight = new Flight(12, "Kempegowda Internatioinl Airport", 32, "Indian Airlines", 56, "Kingfisher");
        flight.displayAirportDetails();
        flight.displayAirlinesDetails();
        flight.displayFlightDetails();
    }
}
