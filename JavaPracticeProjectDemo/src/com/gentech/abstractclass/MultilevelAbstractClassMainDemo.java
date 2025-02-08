package com.gentech.abstractclass;

abstract class Employee{

    abstract void worker(String name);

    abstract void teamType(int id);
}

class Manager extends Employee {

    @Override
    void worker(String managerName) {
        System.out.println("Manager:"+managerName);
    }

    @Override
    void teamType(int managerId) {
        System.out.println("Manager Id:"+managerId);
    }
}

class HRManager extends Manager{

    HRManager(int managerId, String managerName, int hrManagerId, String hrManagerName) {
        super.worker(managerName);
        super.teamType(managerId);
    }
    @Override
    void worker(String hrManagerName) {
        System.out.println("Hr Manager:"+hrManagerName);
    }

    @Override
    void teamType(int hrManagerId) {
        System.out.println("Hr Manager Id:"+hrManagerId);
    }
}

public class MultilevelAbstractClassMainDemo {
    public static void main(String[] args) {
        HRManager hrManager = new HRManager( 23, "Mahesh", 56, "Rohith");
        hrManager.worker("Deepak");
        hrManager.teamType(12);
    }
}
