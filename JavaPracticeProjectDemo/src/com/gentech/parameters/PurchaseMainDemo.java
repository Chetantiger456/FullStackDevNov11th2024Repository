package com.gentech.parameters;

class Purchase{
    int purchaseId;
    String purchaseItemName;
    int purchaseProductId;
    int purchaseQuantity;
    double unitPrice;
    double totalPrice;

    Purchase(int purchaseId, String purchaseItemName, int purchaseProductId, int purchaseQuantity, int unitPrice, int totalPrice) {
        this.purchaseId = purchaseId;
        this.purchaseItemName = purchaseItemName;
        this.purchaseProductId = purchaseProductId;
        this.purchaseQuantity = purchaseQuantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
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

    Sales(int salesId, String salesName, int salesPrice, int quantitySold, String salesDate) {
        this.salesId = salesId;
        this.salesName = salesName;
        this.salesPrice = salesPrice;
        this.quantitySold = quantitySold;
        this.salesDate = salesDate;
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

    Inventory(int inventoryId, String inventoryName, int inventoryProductId, int quantityInStock, int createdAt) {
        this.inventoryId = inventoryId;
        this.inventoryName = inventoryName;
        this.inventoryProductId = inventoryProductId;
        this.quantityInStock = quantityInStock;
        this.createdAt = createdAt;
        System.out.println("Inventory Id:"+inventoryId);
        System.out.println("Inventory Name:"+inventoryName);
        System.out.println("Inventory ProductId"+inventoryProductId);
        System.out.println("Inventory Quantity InStock:"+quantityInStock);
        System.out.println("Inventory CreatedAt:"+createdAt);
    }
}

public class PurchaseMainDemo {
    public static void main(String[] args) {

        Purchase purchase = new Purchase(10, "shuttle cock", 2, 4, 1200, 6000);

        Sales sales = new Sales(23, "Central products", 4500, 3, "10-12-2024");

        Inventory inventory = new Inventory(45, "Fantastic fashion", 14, 18, 14-12-2024);

    }
}
