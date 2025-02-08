package com.test3;
class Con1
{
   void show()
   {
       System.out.println("show");
   }
}
class Con2 extends Con1{
    Con2(int id, String name){
        System.out.println(id+" "+name);
    }
    Con2(long mobile){
        System.out.println(mobile);
    }
}

class Con3 extends Con2{

    Con3(int id, String name, String email) {
        super(id, name);
        System.out.println(email);
    }
    Con3(long mobile, int zip){
        super(mobile);
        System.out.println(zip);
    }
}
public class MainDemo3 {
    public static void main(String[] args) {
        Con3 con3 = new Con3(10, "aryan", "ara@gmail.com");
        Con3 con4 = new Con3(9876543219L, 560026);
        con3.show();
    }
}
