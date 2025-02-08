package com.gentech.abstractclass;

abstract class Employees{

    abstract void displayEmployeeDetails();
}

class SecurityOfficer extends Employees {
    int securityOfficerId;
    String securityOfficerName;

    SecurityOfficer(int securityOfficerId, String securityOfficerName) {
       // super(employeeId, employeeName);
        this.securityOfficerId = securityOfficerId;
        this.securityOfficerName = securityOfficerName;
    }
    void displayEmployeeDetails(){
        System.out.println("Security Officer Id:"+securityOfficerId);
        System.out.println("Security Officer Name:"+securityOfficerName);
    }
}

class AirlineStaff extends Employees {
    int airlineStaffId;
    String airlineStaffName;

    AirlineStaff(int airlineStaffId, String airlineStaffName) {
        this.airlineStaffId = airlineStaffId;
        this.airlineStaffName = airlineStaffName;
    }
    void displayEmployeeDetails(){
        System.out.println("Airline Staff Id:"+airlineStaffId);
        System.out.println("Airline Staff Name:"+airlineStaffName);
    }
}

class Flight extends AirlineStaff {
    int flightId;
    String flightName;
    Flight(int airlineStaffId, String airlineStaffName, int flightId, String flightName) {
        super(airlineStaffId, airlineStaffName);
        super.displayEmployeeDetails();
        this.flightId = flightId;
        this.flightName = flightName;
    }
    void displayEmployeeDetails(){
        System.out.println("Flight Id:"+flightId);
        System.out.println("Flight Name:"+flightName);
    }
}


public class HybridAbstractClassesMainDemo {
    public static void main(String[] args) {
      SecurityOfficer securityOfficer = new SecurityOfficer(12, "Hemanth");
      securityOfficer.displayEmployeeDetails();

      Flight flight = new Flight(34, "Arshal", 45, "Karthik");
      flight.displayEmployeeDetails();
    }
}

