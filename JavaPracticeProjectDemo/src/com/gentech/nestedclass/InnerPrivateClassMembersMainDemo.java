package com.gentech.nestedclass;
class OuterClass2 {
    int studentId;
    InnerClass2 innerClass2 = new InnerClass2();

    void showStudentName(){
        innerClass2.showStudentId();
        innerClass2.studentName = "Akashy";
        System.out.println("Student Name :"+innerClass2.studentName);
    }

   private class InnerClass2 {
        private String studentName;

       private void showStudentId(){
            studentId = 12;
            System.out.println("Student Id:"+studentId);
        }
    }
}
public class InnerPrivateClassMembersMainDemo {
    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        outerClass2.showStudentName();
    }
}
