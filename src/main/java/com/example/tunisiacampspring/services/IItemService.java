package com.example.tunisiacampspring.services;

import com.example.tunisiacampspring.entities.Item;

public interface IItemService {
    public Item add_item(Item item);
    public Item retreive_item(Long id);
    public Item update_Item(Item item);
    public void delete_item(Long id );
}