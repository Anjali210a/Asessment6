package com.inventory.controller;

import com.inventory.model.InventoryItem;
import com.inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping
    public List<InventoryItem> getItems() {
        return inventoryService.getAllItems();
    }

    @PostMapping
    public InventoryItem addItem(@RequestBody InventoryItem item) {
        return inventoryService.addItem(item);
    }
}