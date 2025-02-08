package com.gentech.inheritance;
class Employees{
    int employeeId;
    String employeeName;
    Employees(int employeeId, String employeeName){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }
    void displayEmployeeDetails(){
        System.out.println("Employee Id:"+employeeId);
        System.out.println("Employee Name:"+employeeName);
    }
}

class SecurityOfficer extends Employees{
    int securityOfficerId;
    String securityOfficerName;

    SecurityOfficer(int employeeId, String employeeName, int securityOfficerId, String securityOfficerName) {
        super(employeeId, employeeName);
        this.securityOfficerId = securityOfficerId;
        this.securityOfficerName = securityOfficerName;
    }
    void displaySecurityOfficerDetails(){
        System.out.println("Security Officer Id:"+securityOfficerId);
        System.out.println("Security Officer Name:"+securityOfficerName);
    }
}

class AirlineStaff extends Employees{
    int airlineStaffId;
    String airlineStaffName;

    AirlineStaff(int employeeId, String employeeName, int airlineStaffId, String airlineStaffName) {
        super(employeeId, employeeName);
        this.airlineStaffId = airlineStaffId;
        this.airlineStaffName = airlineStaffName;
    }
    void displayAirlineStaff(){
        System.out.println("Airline Staff Id:"+airlineStaffId);
        System.out.println("Airline Staff Name:"+airlineStaffName);
    }
}

class Pilot extends Employees{
    int pilotId;
    String pilotName;
    Pilot(int employeeId, String employeeName, int pilotId, String pilotName) {
        super(employeeId, employeeName);
        this.pilotId = pilotId;
        this.pilotName = pilotName;
    }
    void displayPilotDetails(){
        System.out.println("Pilot Id:"+pilotId);
        System.out.println("Pilot Name:"+pilotName);
    }
}

public class HierarchicalInheritanceMainDemo {
    public static void main(String[] args) {
        SecurityOfficer securityOfficer = new SecurityOfficer(12, "Harish", 34, "Govardhan");
        securityOfficer.displayEmployeeDetails();
        securityOfficer.displaySecurityOfficerDetails();

        AirlineStaff airlineStaff = new AirlineStaff(34, "vijay", 67, "Harsha");
        airlineStaff.displayEmployeeDetails();
        airlineStaff.displayAirlineStaff();

        Pilot pilot = new Pilot(76, "Umesh", 45, "Diganth");
        pilot.displayEmployeeDetails();
        pilot.displayPilotDetails();
    }
}
