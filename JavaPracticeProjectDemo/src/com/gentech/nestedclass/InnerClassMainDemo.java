package com.gentech.nestedclass;
class OuterClass{
    int studentId;
    InnerClass innerClass = new InnerClass();
    void showStudentName(){
        innerClass.studentName = "Ravi";
        System.out.println("Student Name :"+innerClass.studentName);
    }
    class InnerClass {
      String studentName;

      void showStudentId(){
        studentId = 12;
          System.out.println("Student Id:"+studentId);
      }
    }
}
public class InnerClassMainDemo {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.showStudentName();
        outerClass.innerClass.showStudentId();
    }
}
