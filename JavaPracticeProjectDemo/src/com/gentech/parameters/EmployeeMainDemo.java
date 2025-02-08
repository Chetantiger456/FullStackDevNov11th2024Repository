package com.gentech.parameters;

class Employee {
    int empId;
    String empName;
    long empMobile;
    String empEmail;
    int empSalary;

    Employee(int empId, String empName, long empMobile, String empEmail, int empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empMobile = empMobile;
        this.empEmail = empEmail;
        this.empSalary = empSalary;

        System.out.println("Employee Id:"+empId);
        System.out.println("Employee Name:"+empName);
        System.out.println("Employee Mobile:"+empMobile);
        System.out.println("Employee Email:"+empEmail);
        System.out.println("Employee Salary:"+empSalary);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
    }
}

class Department {
    int deptId;
    String deptName;
    int managerId;
    String location;
    String createdDate;

    Department(int deptId, String deptName, int managerId, String location, String createdDate) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.managerId = managerId;
        this.location = location;
        this.createdDate = createdDate;
        System.out.println("Department Id:"+deptId);
        System.out.println("Department Name:"+deptName);
        System.out.println("Department Manager:"+managerId);
        System.out.println("Department Location:"+location);
        System.out.println("Department Date:"+createdDate);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
    }
}

class Insurance {
    int insId;
    String insName;
    String insPolicyNumber;
    String insPolicyType;
    String startDate;
    String endDate;

    Insurance(int insId, String insName, String insPolicyNumber, String insPolicyType, String startDate, String endDate) {
        this.insId = insId;
        this.insName = insName;
        this.insPolicyNumber = insPolicyNumber;
        this.insPolicyType = insPolicyType;
        this.startDate = startDate;
        this.endDate = endDate;

        System.out.println("Insurance Id:"+insId);
        System.out.println("Insurance Name:"+insName);
        System.out.println("Insurance PolicyType:"+insPolicyNumber);
        System.out.println("Insurance PolicyNumber:"+insPolicyType);
        System.out.println("Insurance Start Date:"+startDate);
        System.out.println("Insurance End Date:"+endDate);
    }
}
public class EmployeeMainDemo {
    public static void main(String[] args) {
        Employee employee = new Employee(10, "Vijay",  9876543291L, "vijay@gmail.com", 100000);


        Department department = new Department(12, "Finance", 10, "Bangalore", "10-12-2024");


        Insurance insurance = new Insurance(34, "Life insurance policy", "ABC123", "Life", "12-12-2024", "12-12-2024");

    }
}
