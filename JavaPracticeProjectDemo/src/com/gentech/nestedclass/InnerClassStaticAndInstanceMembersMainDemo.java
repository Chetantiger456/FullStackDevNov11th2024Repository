package com.gentech.nestedclass;
class OuterClass4 {
    int studentId;
    long studentMobileNumber;
    InnerClass4 innerClass4 = new InnerClass4();
    void showStudentName()
    {
        InnerClass4.studentName = "Raj";
        System.out.println("Student Name:"+InnerClass4.studentName);
    }
    void showStudentEmail()
    {

        innerClass4.studentEmail = "raj@gamil.com";
        System.out.println("Student Email:"+innerClass4.studentEmail);
    }

    static class InnerClass4 {
        static String studentName;
        String studentEmail;

        static void showStudentId(){
            OuterClass4 outerClass4 = new OuterClass4();
            outerClass4.studentId = 12;
            System.out.println("Student Id:"+outerClass4.studentId);
        }

        void showStudentMobileNumber(){
            OuterClass4 outerClass4 = new OuterClass4();
            outerClass4.studentMobileNumber = 9829483842L;
            System.out.println("Student Mobile Number:"+outerClass4.studentMobileNumber);
        }
    }
}
public class InnerClassStaticAndInstanceMembersMainDemo {
    public static void main(String[] args) {
        OuterClass4 outerClass4 = new OuterClass4();
        outerClass4.showStudentName();
        outerClass4.showStudentEmail();
        OuterClass4.InnerClass4.showStudentId();
        outerClass4.innerClass4.showStudentMobileNumber();
    }
}
