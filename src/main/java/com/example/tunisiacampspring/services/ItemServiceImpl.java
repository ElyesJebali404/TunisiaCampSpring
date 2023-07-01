package com.example.tunisiacampspring.services;

import com.example.tunisiacampspring.entities.Item;
import com.example.tunisiacampspring.repositories.itemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements IItemService{
    @Autowired
    private itemRepository itemRepository;
    @Override
    public Item add_item(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item retreive_item(Long id) {
        return itemRepository.findById(id).orElse(null);
    }

    @Override
    public Item update_Item(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void delete_item(Long id) {
        itemRepository.deleteById(id);
    }
}
