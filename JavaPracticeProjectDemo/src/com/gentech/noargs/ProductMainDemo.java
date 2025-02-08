package com.gentech.noargs;
class Product {
    int productId;
    String productName;
    String productCategory;
    double productPrice;
    String productLocation;

    Product() {
        productId = 23;
        productName = "Shoes";
        productCategory = "Men Shoes";
        productPrice = 4500.78;
        productLocation = "Mumbai";
        System.out.println("Product Id:" + productId);
        System.out.println("Product Name:" + productName);
        System.out.println("Product Category:" + productCategory);
        System.out.println("Product Price:" + productPrice);
        System.out.println("Product Location:" + productLocation);
        System.out.println("+++++++++++++++++++++++++++++");
    }
}

class Order {
    int orderId;
    String orderPaymentMethod;
    String orderPlacedDateTime;
    int customerId;
    int productId;

    Order() {
        orderId = 45;
        orderPaymentMethod = "Cash on delivery";
        orderPlacedDateTime = "10-12-2024 10:34:23";
        customerId = 78;
        productId = 43;
        System.out.println("Order Id:"+orderId);
        System.out.println("Order Payment Method:"+orderPaymentMethod);
        System.out.println("Order Placed Date Time:"+orderPlacedDateTime);
        System.out.println("Ordered Customer Id:"+customerId);
        System.out.println("Ordered Product Id:"+productId);
        System.out.println("+++++++++++++++++++++++++++++");
    }
}

class Shipping {
    int shippingId;
    String shipperName;
    String shippingLocation;
    String shippingDateTime;
    int shippingOrderId;

    Shipping() {
        shippingId = 67;
        shipperName = "Dwarf Shipper";
        shippingLocation = "Pune";
        shippingDateTime = "16-12-2024 18:23:56";
        shippingOrderId = 42;
        System.out.println("Shipping Id:"+shippingId);
        System.out.println("Shipping Name:"+shipperName);
        System.out.println("Shipping Location:"+shippingLocation);
        System.out.println("Shipping Date Time:"+shippingDateTime);
        System.out.println("Shipping OrderId:"+shippingOrderId);
    }
}

public class ProductMainDemo {
    public static void main(String[] args) {
        Product product = new Product();

        Order order = new Order();

        Shipping shipping =new Shipping();

    }
}
