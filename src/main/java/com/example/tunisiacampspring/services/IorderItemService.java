package com.example.tunisiacampspring.services;

import com.example.tunisiacampspring.entities.orderItem;

public interface IorderItemService {
    public orderItem add_orderItem(orderItem orderItem);
    public orderItem retreive_orderItem(Long id);
    public orderItem update_orderItem(orderItem orderItem);
    public void delete_orderItem(Long id );
}