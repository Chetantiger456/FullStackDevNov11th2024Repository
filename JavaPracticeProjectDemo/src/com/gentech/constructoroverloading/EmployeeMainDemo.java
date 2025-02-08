package com.gentech.constructoroverloading;

class Employee {
    Employee(int employeeId, String employeeName){
        System.out.println("Employee Id:"+employeeId+", "+"Employee Name:"+employeeName);
    }
    Employee(String employeeEmail) {
        System.out.println("Employee Email:"+employeeEmail);
    }
    Employee(long employeeMobile) {
        System.out.println("Employee Mobile:"+employeeMobile);
    }
    Employee(int employeeSalary) {
        System.out.println("Employee Salary:"+employeeSalary);
    }
    Employee(boolean employeeWorkStatus) {
        System.out.println("Employee Work Status:"+employeeWorkStatus);
    }
}

public class EmployeeMainDemo {
    public static void main(String[] args) {
    Employee employee = new Employee(10, "Vijay");
    Employee employee1 = new Employee("vijay@gmail.com");
    Employee employee2 = new Employee(9632480012L);
    Employee employee3 = new Employee(100000);
    Employee employee4 = new Employee(true);
    }
}
