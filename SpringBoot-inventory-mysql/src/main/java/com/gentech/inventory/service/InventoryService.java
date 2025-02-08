package com.gentech.inventory.service;

import com.gentech.inventory.entity.Inventory;

import java.util.List;

public interface InventoryService {
    Inventory createInventory(Inventory inventory);
    List<Inventory> getAllInventory();
    Inventory getInventory(Long id);
    Inventory modifyInventory(Long id, Inventory inventory);
    boolean deleteInventory(Long Id);
}
