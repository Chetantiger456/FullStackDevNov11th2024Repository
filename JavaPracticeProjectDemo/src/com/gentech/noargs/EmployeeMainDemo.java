package com.gentech.noargs;

class Employee {
    int empId;
    String empName;
    long empMobile;
    String empEmail;
    int empSalary;

    Employee() {
        empId=10;
        empName="Vijay";
        empMobile = 9876543291L;
        empEmail = "vijay@gmail.com";
        empSalary = 100000;

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

    Department() {
        deptId = 12;
        deptName = "Finance";
        managerId = 10;
        location = "Bangalore";
        createdDate = "10-12-1024";
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

    Insurance() {
        insId = 34;
        insName = "Life insurance policy";
        insPolicyNumber = "ABC123";
        insPolicyType = "Life";
        startDate = "12-12-2024";
        endDate = "12-12-2024";

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
        Employee employee = new Employee();


        Department department = new Department();


        Insurance insurance = new Insurance();

    }
}
