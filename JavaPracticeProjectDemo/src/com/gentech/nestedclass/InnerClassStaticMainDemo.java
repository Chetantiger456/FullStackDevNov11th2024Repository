package com.gentech.nestedclass;
class OuterClass3 {
    int studentId;
    InnerClass3 innerClass3 = new InnerClass3();

    void showStudentName()
    {
        innerClass3.studentName = "Ajay";
        System.out.println("Student Name:"+innerClass3.studentName);
    }

    static class InnerClass3 {
        String studentName;

        void showStudentId()
        {
           OuterClass3 outerClass3 = new OuterClass3();
           outerClass3.studentId = 12;
           System.out.println("Student Id:"+outerClass3.studentId);
        }
    }

}

public class InnerClassStaticMainDemo {
    public static void main(String[] args) {
        OuterClass3 outerClass3 = new OuterClass3();
        outerClass3.showStudentName();
        OuterClass3.InnerClass3 innerClass4 = new OuterClass3.InnerClass3();
        innerClass4.showStudentId();
        outerClass3.innerClass3.showStudentId();
    }
}
