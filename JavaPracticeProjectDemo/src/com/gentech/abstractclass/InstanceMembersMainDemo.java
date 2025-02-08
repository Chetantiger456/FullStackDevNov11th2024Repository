package com.gentech.abstractclass;
abstract class InstanceMembers{
    String name;
    int age;

    abstract void getName();
    abstract void getAge();
}

class ExtendAbstractMembers extends InstanceMembers{
    ExtendAbstractMembers(String name, int age){
        super.name = name;
        super.age = age;
    }
    @Override
    void getName() {
        System.out.println("Name:"+name);
    }

    @Override
    void getAge() {
        System.out.println("Age:"+age);
    }
}
public class InstanceMembersMainDemo {
    public static void main(String[] args) {
        ExtendAbstractMembers extendAbstractMembers = new ExtendAbstractMembers("Sanjay", 34);
        extendAbstractMembers.getName();
        extendAbstractMembers.getAge();
    }
}
