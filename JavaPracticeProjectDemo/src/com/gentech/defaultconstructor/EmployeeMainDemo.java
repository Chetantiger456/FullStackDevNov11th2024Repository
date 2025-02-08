package com.gentech.defaultconstructor;

import java.util.Date;

class Employee {
    int empId;
    String empName;
    long empMobile;
    String empEmail;
    int empSalary;
}

class Department {
    int deptId;
    String deptName;
    int managerId;
    String location;
    String createdDate;
}

class Insurance {
    int insId;
    String insName;
    String insPolicyNumber;
    String insPolicyType;
    String startDate;
    String endDate;
}
public class EmployeeMainDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.empId=10;
        employee.empName="Vijay";
        employee.empMobile = 9876543291L;
        employee.empEmail = "vijay@gmail.com";
        employee.empSalary = 100000;

        System.out.println("Employee Id:"+employee.empId);
        System.out.println("Employee Name:"+employee.empName);
        System.out.println("Employee Mobile:"+employee.empMobile);
        System.out.println("Employee Email:"+employee.empEmail);
        System.out.println("Employee Salary:"+employee.empSalary);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

        Department department = new Department();
        department.deptId = 12;
        department.deptName = "Finance";
        department.managerId = 10;
        department.location = "Bangalore";
        department.createdDate = "10-12-1024";
        System.out.println("Department Id:"+department.deptId);
        System.out.println("Department Name:"+department.deptName);
        System.out.println("Department Manager:"+department.managerId);
        System.out.println("Department Location:"+department.location);
        System.out.println("Department Date:"+department.createdDate);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

        Insurance insurance = new Insurance();
        insurance.insId = 34;
        insurance.insName = "Life insurance policy";
        insurance.insPolicyNumber = "ABC123";
        insurance.insPolicyType = "Life";
        insurance.startDate = "12-12-2024";
        insurance.endDate = "12-12-204";

        System.out.println("Insurance Id:"+insurance.insId);
        System.out.println("Insurance Name:"+insurance.insName);
        System.out.println("Insurance PolicyType:"+insurance.insPolicyNumber);
        System.out.println("Insurance PolicyNumber:"+insurance.insPolicyType);
        System.out.println("Insurance Start Date:"+insurance.startDate);
        System.out.println("Insurance End Date:"+insurance.endDate);
    }
}
