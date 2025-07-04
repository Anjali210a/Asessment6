package com.inventory.service;

import com.inventory.model.InventoryItem;
import com.inventory.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    public List<InventoryItem> getAllItems() {
        return inventoryRepository.findAll();
    }

    public InventoryItem addItem(InventoryItem item) {
        InventoryItem saved = inventoryRepository.save(item);
        messagingTemplate.convertAndSend("/topic/inventory", saved);
        return saved;
    }
}