package com.gentech.abstractclass;
class Student{
    Student(int stdId, String strName){
        System.out.println("Student Id:"+stdId);
        System.out.println("Student Name:"+strName);
    }
    Student(String courseName, boolean stdActive){
        System.out.println("Student Course Name:"+courseName);
        System.out.println("Student Active:"+stdActive);
    }
}

class StudentInfo extends Student{

    StudentInfo(int stdId, String strName) {
        super(stdId, strName);
    }

    StudentInfo(String courseName, boolean stdActive) {
        super(courseName, stdActive);
    }
}
public class ConstructorOverloadingAbstractClassMainDemo {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo(10, "Harsha");
        StudentInfo studentInfo1 = new StudentInfo("Computer Science", true);
    }
}
