package com.gentech.defaultconstructor;

class Purchase{
    int purchaseId;
    String purchaseItemName;
    int purchaseProductId;
    int purchaseQuantity;
    double unitPrice;
    double totalPrice;

}

class Sales {
    int salesId;
    String salesName;
    double salesPrice;
    int quantitySold;
    int salesDate;
}

class Inventory{
    int inventoryId;
    String inventoryName;
    int inventoryProductId;
    int quantityInStock;
    int createdAt;
}

public class PurchaseMainDemo {
    public static void main(String[] args) {

        Purchase purchase = new Purchase();
        purchase.purchaseId=10;
        purchase.purchaseItemName = "shuttle cock";
        purchase.purchaseProductId = 2;
        purchase.purchaseQuantity = 4;
        purchase.unitPrice = 1200;
        purchase.totalPrice = 6000;
        System.out.println("Purchase Id:"+purchase.purchaseId);
        System.out.println("Purchase Item Name:"+purchase.purchaseProductId);
        System.out.println("Purchase Quantity:"+purchase.purchaseQuantity);
        System.out.println("Purchase Unit Price:"+purchase.unitPrice);
        System.out.println("Purchase Total Price:"+purchase.totalPrice);
        System.out.println("+++++++++++++++++++++++++++++");

        Sales sales = new Sales();
        sales.salesId = 23;
        sales.salesName = "Central products";
        sales.salesPrice = 4500;
        sales.quantitySold = 3;
        sales.salesDate = 10-12-2024;
        System.out.println("Sales Id:"+sales.salesId);
        System.out.println("Sales Name:"+sales.salesName);
        System.out.println("Sales Price:"+sales.quantitySold);
        System.out.println("Sales Quantity Sold:"+sales.quantitySold);
        System.out.println("Sales Date:"+sales.salesDate);
        System.out.println("+++++++++++++++++++++++++++++++++++");

        Inventory inventory = new Inventory();
        inventory.inventoryId = 45;
        inventory.inventoryName = "Fantastic fashion";
        inventory.inventoryProductId = 14;
        inventory.quantityInStock = 18;
        inventory.createdAt = 14-12-2024;
        System.out.println("Inventory Id:"+inventory.inventoryId);
        System.out.println("Inventory Name:"+inventory.inventoryName);
        System.out.println("Inventory ProductId"+inventory.inventoryProductId);
        System.out.println("Inventory Quantity InStock:"+inventory.quantityInStock);
        System.out.println("Inventory CreatedAt:"+inventory.createdAt);
    }
}
