package com.gentech.nestedclass;

class OuterClass1 {
    int studentId;

    InnerClass1 innerClass1 = new InnerClass1();

    void showStudentName(){
        innerClass1.showStudentId();
        innerClass1.studentName="Varun";
        System.out.println("Student Name:"+innerClass1.studentName);
    }
   private class InnerClass1 {
        String studentName;

        void showStudentId(){
            studentId = 12;
            System.out.println("Student Id:"+studentId);
        }
    }
}

public class InnerPrivateClassMainDemo {
    public static void main(String[] args) {
        OuterClass1 outerClass1 = new OuterClass1();
        outerClass1.showStudentName();
        //outerClass1.innerClass1.showStudentId();
    }
}
