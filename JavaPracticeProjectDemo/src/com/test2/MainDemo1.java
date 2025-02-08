package com.test2;
class Demo1{
    static void show(){
        System.out.println("Show");
    }

    static void display(){
        System.out.println("display");
    }
}

class Demo2{
    Demo2(){
        Demo1.show();
        Demo1.display();
    }
}

public class MainDemo1 {
    public static void main(String[] args) {
        Demo2 d =new Demo2();
    }
}
