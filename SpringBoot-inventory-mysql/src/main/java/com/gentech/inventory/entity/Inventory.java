package com.gentech.inventory.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inventoryId;
    @Column(name = "inventory_description")
    private String inventoryDescription;
    @Column(name = "inventory_unit_price")
    private int inventoryUnitPrice;
    @Column(name = "inventory_quantity")
    private int inventoryQuantity;

    public Inventory() {
    }

    public Inventory(String inventoryDescription, int inventoryUnitPrice, int inventoryQuantity) {
        this.inventoryDescription = inventoryDescription;
        this.inventoryUnitPrice = inventoryUnitPrice;
        this.inventoryQuantity = inventoryQuantity;
    }

    public Long getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Long inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getInventoryDescription() {
        return inventoryDescription;
    }

    public void setInventoryDescription(String inventoryDescription) {
        this.inventoryDescription = inventoryDescription;
    }

    public int getInventoryUnitPrice() {
        return inventoryUnitPrice;
    }

    public void setInventoryUnitPrice(int inventoryUnitPrice) {
        this.inventoryUnitPrice = inventoryUnitPrice;
    }

    public int getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(int inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }
}
