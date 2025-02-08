package com.test2;
class InstanceMembers {
    InstanceMembers(){
        System.out.println("Constructors");
    }

    void show(){
        System.out.println("Instance method");
    }
}

public class InstanceMethodConstructorMainDemo {
    public static void main(String[] args) {
       InstanceMembers instanceMembers = new InstanceMembers();
       instanceMembers.show();
    }
}
