package com.gentech.inheritance;
class Employees2{
    void displayEmpName(String empName){
        System.out.println("Employee Name:"+empName);
    }
}

class SecurityOfficer2 extends Employees2{
    SecurityOfficer2(String empName){
        super.displayEmpName(empName);
    }
    void displayEmpName(String secName){
        System.out.println("Security Name:"+secName);
    }

}

class Pilot2 extends Employees2 {
    Pilot2(String empName){
        super.displayEmpName(empName);
    }
    void displayEmpName(String pilName){
        System.out.println("Pilot Name:"+pilName);
    }

}
public class HierarchicalInheritanceMethodWithSignatureMainDemo {
    public static void main(String[] args) {
        SecurityOfficer2 securityOfficer2 = new SecurityOfficer2("Govind");
        securityOfficer2.displayEmpName("Rahul");

        Pilot2 pilot2 = new Pilot2("Ashwin");
        pilot2.displayEmpName("Haris");
    }
}
