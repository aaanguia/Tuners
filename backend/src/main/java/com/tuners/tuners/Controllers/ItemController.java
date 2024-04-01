package com.tuners.tuners.Controllers;

import com.tuners.tuners.Models.ItemModel;
import com.tuners.tuners.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ItemController {
    // Auto wire
    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService){
        this.itemService = itemService;
    }

    @PostMapping("/addItem")
    public ItemModel addItem(@RequestBody ItemModel model){
        return itemService.saveItem(model);
    }

    @GetMapping("/inventory")
    public List<ItemModel> getInventory(){
        return itemService.getItems();
    }

    @GetMapping("/inventory/{id}")
    public ItemModel getInventory(@PathVariable String id){
        return itemService.getItemById(id);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteItem(@PathVariable String id){ itemService.deleteItem(id); }

    @PostMapping("updatePost")
    public ItemModel updateItem(@RequestBody ItemModel model){
        return itemService.updateItem(model);
    }
}
