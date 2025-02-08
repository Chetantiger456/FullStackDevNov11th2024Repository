package com.gentech.parameters;
class Product {
    int productId;
    String productName;
    String productCategory;
    double productPrice;
    String productLocation;

    Product(int productId, String productName, String productCategory, double productPrice, String productLocation) {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
        this.productLocation = productLocation;
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

    Order(int orderId, String orderPaymentMethod, String orderPlacedDateTime, int customerId, int productId) {
        this.orderId = orderId;
        this.orderPaymentMethod = orderPaymentMethod;
        this.orderPlacedDateTime = orderPlacedDateTime;
        this.customerId = customerId;
        this.productId = productId;
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

    Shipping(int shippingId, String shipperName, String shippingLocation, String shippingDateTime, int shippingOrderId) {
        this.shippingId = shippingId;
        this.shipperName = shipperName;
        this.shippingLocation = shippingLocation;
        this.shippingDateTime = shippingDateTime;
        this.shippingOrderId = shippingOrderId;
        System.out.println("Shipping Id:"+shippingId);
        System.out.println("Shipping Name:"+shipperName);
        System.out.println("Shipping Location:"+shippingLocation);
        System.out.println("Shipping Date Time:"+shippingDateTime);
        System.out.println("Shipping OrderId:"+shippingOrderId);
    }
}

public class ProductMainDemo {
    public static void main(String[] args) {
        Product product = new Product(23, "Shoes", "Men Shoes", 4500.78, "Mumbai");

        Order order = new Order(45, "Cash on delivery", "10-12-2024 10:34:23", 78, 43);

        Shipping shipping =new Shipping(67, "Dwarf Shipper", "Pune", "16-12-2024 18:23:56", 42);

    }
}
