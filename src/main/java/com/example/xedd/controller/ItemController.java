package com.example.xedd.controller;

import com.example.xedd.model.Item;
import com.example.xedd.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping(value ="api/v1/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    private List<Item> items = new ArrayList<>();

 //constructor

    public ItemController(ItemService itemService) {
        super();
        this.itemService = itemService;
    }


    //build create item rest api
    @PostMapping("")
    public ResponseEntity<Object> createItem(@RequestBody Item item){
        itemService.createItem(item);
        return ResponseEntity.ok("Added");
    }
    @GetMapping
    public ResponseEntity<Object> getItems() { return ResponseEntity.ok().body(itemService.getAllItems()); }
 public List<Item> fetchItems(@RequestParam(name="name", defaultValue="") String name,
                                 @RequestParam(name="description", defaultValue="") String description) {
        return (List<Item>) ResponseEntity.ok().body(itemService.getAllItems());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Object> getItem(@PathVariable("id") long id) {
        return ResponseEntity.ok().body(itemService.getItemById(id));
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<Object> updateItem(@PathVariable("id") long id, @RequestBody Item item) {
        itemService.updateItem(id, item);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<Object> updateItemPartial(@PathVariable("id") long id, @RequestBody Map<String, String> fields) {
        itemService.partialUpdateItem(id, fields);
        return ResponseEntity.noContent().build();
    }

}

