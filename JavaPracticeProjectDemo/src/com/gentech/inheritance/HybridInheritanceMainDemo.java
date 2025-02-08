package com.gentech.inheritance;
class Employees1{
    int employeeId;
    String employeeName;
    Employees1(int employeeId, String employeeName){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }
    void displayEmployeeDetails(){
        System.out.println("Employee Id:"+employeeId);
        System.out.println("Employee Name:"+employeeName);
    }
}

class SecurityOfficer1 extends Employees1{
    int securityOfficerId;
    String securityOfficerName;

    SecurityOfficer1(int employeeId, String employeeName, int securityOfficerId, String securityOfficerName) {
        super(employeeId, employeeName);
        this.securityOfficerId = securityOfficerId;
        this.securityOfficerName = securityOfficerName;
    }
    void displaySecurityOfficerDetails(){
        System.out.println("Security Officer Id:"+securityOfficerId);
        System.out.println("Security Officer Name:"+securityOfficerName);
    }
}

class AirlineStaff1 extends Employees1{
    int airlineStaffId;
    String airlineStaffName;

    AirlineStaff1(int employeeId, String employeeName, int airlineStaffId, String airlineStaffName) {
        super(employeeId, employeeName);
        this.airlineStaffId = airlineStaffId;
        this.airlineStaffName = airlineStaffName;
    }
    void displayAirlineStaff(){
        System.out.println("Airline Staff Id:"+airlineStaffId);
        System.out.println("Airline Staff Name:"+airlineStaffName);
    }
}

class Flight1 extends AirlineStaff1{
    int flightId;
    String flightName;
    Flight1(int employeeId, String employeeName, int airlineStaffId, String airlineStaffName, int flightId, String flightName) {
        super(employeeId, employeeName, airlineStaffId, airlineStaffName);
        this.flightId = flightId;
        this.flightName = flightName;
    }
    void displayFlightDetails(){
        System.out.println("Flight Id:"+flightId);
        System.out.println("Flight Name:"+flightName);
    }
}

public class HybridInheritanceMainDemo {
    public static void main(String[] args) {
            SecurityOfficer1 securityOfficer1 = new SecurityOfficer1(12, "Harish", 34, "Govardhan");
            securityOfficer1.displayEmployeeDetails();
            securityOfficer1.displaySecurityOfficerDetails();

            Flight1 flight1 = new Flight1(34, "vijay", 67, "Harsha", 89, "Kingfisher");
            flight1.displayEmployeeDetails();
            flight1.displayAirlineStaff();
            flight1.displayFlightDetails();
    }
}
