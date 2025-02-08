package com.test3;
class Order
{
    void showNetPrice(int orderPrice)
    {
        System.out.println("Order Price:"+orderPrice);
    }
}
class OrderItems extends Order
{
    OrderItems(int orderPrice)
    {
        super.showNetPrice(orderPrice);
    }
    void showNetPrice(int orderItemPrice)
    {
        System.out.println("Order Item Price:"+orderItemPrice);
    }
}
class Invoice extends OrderItems
{
    Invoice(int orderItemPrice, int orderPrice)
    {
        super(orderPrice);
        super.showNetPrice(orderItemPrice);
    }
    void showNetPrice(int invoicePrice)
    {
        System.out.println("Invoice Price:"+invoicePrice);
    }
}

public class MainDemo1 {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(12332, 232332);
        invoice.showNetPrice(23434);
    }
}
