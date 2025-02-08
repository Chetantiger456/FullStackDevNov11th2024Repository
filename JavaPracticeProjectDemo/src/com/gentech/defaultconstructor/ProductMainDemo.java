package com.gentech.defaultconstructor;
class Product {
    int productId;
    String productName;
    String productCategory;
    double productPrice;
    String productLocation;
}

class Order {
    int orderId;
    String orderPaymentMethod;
    String orderPlacedDateTime;
    int customerId;
    int productId;
}

class Shipping {
    int shippingId;
    String shipperName;
    String shippingLocation;
    String shippingDateTime;
    int shippingOrderId;
}

public class ProductMainDemo {
    public static void main(String[] args) {
        Product product = new Product();
        product.productId = 23;
        product.productName = "Shoes";
        product.productCategory = "Men Shoes";
        product.productPrice = 4500.78;
        product.productLocation = "Mumbai";
        System.out.println("Product Id:"+product.productId);
        System.out.println("Product Name:"+product.productName);
        System.out.println("Product Category:"+product.productCategory);
        System.out.println("Product Price:"+product.productPrice);
        System.out.println("Product Location:"+product.productLocation);
        System.out.println("+++++++++++++++++++++++++++++");

        Order order = new Order();
        order.orderId = 45;
        order.orderPaymentMethod = "Cash on delivery";
        order.orderPlacedDateTime = "10-12-2024 10:34:23";
        order.customerId = 78;
        order.productId = 43;
        System.out.println("Order Id:"+order.orderId);
        System.out.println("Order Payment Method:"+order.orderPaymentMethod);
        System.out.println("Order Placed Date Time:"+order.orderPlacedDateTime);
        System.out.println("Ordered Customer Id:"+order.customerId);
        System.out.println("Ordered Product Id:"+order.productId);
        System.out.println("+++++++++++++++++++++++++++++");

        Shipping shipping =new Shipping();
        shipping.shippingId = 67;
        shipping.shipperName = "Dwarf Shipper";
        shipping.shippingLocation = "Pune";
        shipping.shippingDateTime = "16-12-2024 18:23:56";
        shipping.shippingOrderId = 42;
        System.out.println("Shipping Id:"+shipping.shippingId);
        System.out.println("Shipping Name:"+shipping.shipperName);
        System.out.println("Shipping Location:"+shipping.shippingLocation);
        System.out.println("Shipping Date Time:"+shipping.shippingDateTime);
        System.out.println("Shipping OrderId:"+shipping.shippingOrderId);
    }
}
