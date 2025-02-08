package com.test2;
class Demo3{
    int id;
    String name;
    static int pin;
    static String Address;

    void show(){
        System.out.println("instance method");
    }

    static void display(){
        System.out.println("static method");
    }
}

class Demo4{
    Demo4(){
        Demo3 d3 = new Demo3();
        d3.id=10;
        d3.name="santhu";
        System.out.println(d3.name+" "+d3.id);
        d3.show();
        Demo3.pin=560026;
        Demo3.Address="Bangalore";
        System.out.println(Demo3.pin+" "+Demo3.Address);
        Demo3.display();
    }
}
public class Q3MainDemo {
    public static void main(String[] args) {
        Demo4 demo4 = new Demo4();
    }
}
