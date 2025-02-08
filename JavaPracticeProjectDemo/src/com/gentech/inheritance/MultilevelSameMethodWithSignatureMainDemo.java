package com.gentech.inheritance;
class Customer
{
    void displayName(String cusName)
    {
        System.out.println("Customer Name:"+cusName);
    }
}
class Order extends Customer
{
    Order(String cusName)
    {
        super.displayName(cusName);
    }
    void displayName(String ordName)
    {
        System.out.println("Order Name:"+ordName);
    }
}
class Shipping extends Order
{
    Shipping(String ordName, String cusName)
    {
        super(cusName);
       super.displayName(ordName);
    }
    void displayName(String shipName)
    {
        System.out.println("Shipping Name:"+shipName);
    }
}
public class MultilevelSameMethodWithSignatureMainDemo {
    public static void main(String[] args) {
        Shipping shipping = new Shipping("Mobile Order", "Dinesh");
        shipping.displayName("Bluedart");

    }
}
