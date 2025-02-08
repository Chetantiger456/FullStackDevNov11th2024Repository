package com.gentech.inheritance;
class  Customer1{
    String name;
    void displayCustomerName()
    {
        System.out.println("Customer Name:"+name);
    }
}
class Order1 extends Customer1 {
    String name;
    Order1(String cusName)
    {
        super.name = cusName;
    }
    void displayOrderName()
    {
        System.out.println("Order Name:"+name);
    }
}
class Shipping1 extends Order1
{
    String name;
    Shipping1(String orderName, String cusName)
    {
        super(cusName);
        super.name = orderName;
    }
    void displayShippingName()
    {
        System.out.println("Shipping Name:"+name);
     }
}
public class MultilevelSameVariableNameMainDemo {
    public static void main(String[] args) {
        Shipping1 shipping1 = new Shipping1("Mobile Order", "Dinesh");
        shipping1.name = "BlueDart";
        shipping1.displayShippingName();
        shipping1.displayOrderName();
        shipping1.displayCustomerName();
    }
}
