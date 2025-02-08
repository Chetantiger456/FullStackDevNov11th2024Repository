package com.gentech.inventory.serviceimplementation;

import com.gentech.inventory.service.InventoryService;
import com.gentech.inventory.entity.Inventory;
import com.gentech.inventory.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryServiceImplementation implements InventoryService {
    private final InventoryRepository inventoryRepository;

    public InventoryServiceImplementation(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @Override
    public Inventory createInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    @Override
    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    @Override
    public Inventory getInventory(Long id) {
//        Optional<Inventory> inventory = inventoryRepository.findById(id);
//        return inventory.get();
        return inventoryRepository.findById(id).orElseThrow(() -> new RuntimeException("The record does not exist"));
    }

    @Override
    public Inventory modifyInventory(Long id, Inventory inventory) {
        Inventory inventory1 = inventoryRepository.findById(id).orElseThrow(()-> new RuntimeException("The record does not exist"));

        inventory1.setInventoryId(id);
        inventory1.setInventoryDescription(inventory.getInventoryDescription());
        inventory1.setInventoryQuantity(inventory.getInventoryQuantity());
        inventory1.setInventoryUnitPrice(inventory.getInventoryUnitPrice());

        return inventoryRepository.save(inventory1);
    }

    @Override
    public boolean deleteInventory(Long id) {
        Optional<Inventory> inventory = Optional.ofNullable(inventoryRepository.findById(id).orElseThrow(() -> new RuntimeException("The record does not found")));
        if(inventory.isPresent()){
            inventoryRepository.deleteById(id);
        }
        return  inventoryRepository.existsById(id);
    }
}
