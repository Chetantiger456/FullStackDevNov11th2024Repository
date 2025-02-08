package com.gentech.inventory.controller;

import com.gentech.inventory.entity.Inventory;
import com.gentech.inventory.service.InventoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class InventoryController {
    private InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @PostMapping("/inventory")
   public ResponseEntity<Inventory> saveInventory(@RequestBody Inventory inventory){
        return new ResponseEntity<>(inventoryService.createInventory(inventory), HttpStatus.CREATED);
    }

    @GetMapping("/inventories")
    public ResponseEntity<List<Inventory>> displayAllInventory(){
        return new ResponseEntity<>(inventoryService.getAllInventory(), HttpStatus.OK);
    }

    @GetMapping("/inventory/{id}")
   public ResponseEntity<Inventory> getByInventoryId(@PathVariable Long id){
        return new ResponseEntity<>(inventoryService.getInventory(id), HttpStatus.OK);
    }

    @PutMapping("/inventory/update/{id}")
    public ResponseEntity<Inventory> updateInventoryById(@PathVariable Long id, @RequestBody Inventory inventory){
        return new ResponseEntity<>(inventoryService.modifyInventory(id, inventory), HttpStatus.OK);
    }

    @DeleteMapping("/inventory/delete/{id}")
    public ResponseEntity<String> deleteInventoryById(@PathVariable Long id){
        String deleteResult = "";
        if(!inventoryService.deleteInventory(id)){
            deleteResult =  "The record based on "+id+" has been deleted";
        }
        return new ResponseEntity<>(deleteResult, HttpStatus.OK);
    }
}
