package com.example.xedd.service;

import com.example.xedd.model.Item;
import org.springframework.core.io.Resource;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ItemService {
    Collection<Item> getAllItems();
    public abstract long createItem(Item item);
    Collection<Item> getItems(String name);
    Item getItem(Long id);
    public abstract Optional<Item> getItemById(long id);
    public abstract void updateItem(long id, Item item);
    public abstract void partialUpdateItem(long id, Map<String, String> fields);
    public abstract void deleteItem(long id);
    //Resource downloadFile(Long id);

    public boolean itemExistsById(long id);



}
