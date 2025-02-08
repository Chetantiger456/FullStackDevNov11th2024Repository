package com.gentech.noargs;

class Purchase{
    int purchaseId;
    String purchaseItemName;
    int purchaseProductId;
    int purchaseQuantity;
    double unitPrice;
    double totalPrice;

    Purchase() {
        purchaseId = 10;
        purchaseItemName = "shuttle cock";
        purchaseProductId = 2;
        purchaseQuantity = 4;
        unitPrice = 1200;
        totalPrice = 6000;
        System.out.println("Purchase Id:" + purchaseId);
        System.out.println("Purchase Item Name:" + purchaseProductId);
        System.out.println("Purchase Quantity:" + purchaseQuantity);
        System.out.println("Purchase Unit Price:" + unitPrice);
        System.out.println("Purchase Total Price:" + totalPrice);
        System.out.println("+++++++++++++++++++++++++++++");
    }

}

class Sales {
    int salesId;
    String salesName;
    double salesPrice;
    int quantitySold;
    String salesDate;

    Sales() {
        salesId = 23;
        salesName = "Central products";
        salesPrice = 4500;
        quantitySold = 3;
        salesDate = "10-12-2024";
        System.out.println("Sales Id:"+salesId);
        System.out.println("Sales Name:"+salesName);
        System.out.println("Sales Price:"+quantitySold);
        System.out.println("Sales Quantity Sold:"+quantitySold);
        System.out.println("Sales Date:"+salesDate);
        System.out.println("+++++++++++++++++++++++++++++++++++");
    }
}

class Inventory{
    int inventoryId;
    String inventoryName;
    int inventoryProductId;
    int quantityInStock;
    int createdAt;

    Inventory() {
        inventoryId = 45;
        inventoryName = "Fantastic fashion";
        inventoryProductId = 14;
        quantityInStock = 18;
        createdAt = 14-12-2024;
        System.out.println("Inventory Id:"+inventoryId);
        System.out.println("Inventory Name:"+inventoryName);
        System.out.println("Inventory ProductId"+inventoryProductId);
        System.out.println("Inventory Quantity InStock:"+quantityInStock);
        System.out.println("Inventory CreatedAt:"+createdAt);
    }
}

public class PurchaseMainDemo {
    public static void main(String[] args) {

        Purchase purchase = new Purchase();

        Sales sales = new Sales();

        Inventory inventory = new Inventory();

    }
}
