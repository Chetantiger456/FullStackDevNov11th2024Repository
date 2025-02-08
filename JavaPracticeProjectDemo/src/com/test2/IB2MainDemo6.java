package com.test2;
class Demo11{
    {
        System.out.println("First IB");
    }
}

class Demo22{
    {
        Demo11 demo11 = new Demo11();
        System.out.println("Second IB");
    }
}
public class IB2MainDemo6 {
    public static void main(String[] args) {
      Demo22 demo22 = new Demo22();
    }
}
