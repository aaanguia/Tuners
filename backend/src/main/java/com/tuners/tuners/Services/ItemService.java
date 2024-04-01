package com.tuners.tuners.Services;


import com.tuners.tuners.Models.ItemModel;
import com.tuners.tuners.Repository.ItemMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    private ItemMongoRepository itemRepository;

    public ItemService(ItemMongoRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    public ItemModel saveItem(ItemModel model) {
        return itemRepository.save(model);
    }

    public List<ItemModel> getItems() {
        return itemRepository.findAll();
    }

    public ItemModel getItemById(String id){
        return itemRepository.findById(id).orElse(null);
    }

    public void deleteItem(String id) {
        itemRepository.deleteById(id);
    }

    public ItemModel updateItem(ItemModel newItem){
        if(itemRepository.findById(newItem.getId()).isPresent()){
            ItemModel current = itemRepository.findById(newItem.getId()).get();
            current.setItemName(newItem.getItemName());
            current.setImg(newItem.getImg());
            current.setDescription(newItem.getDescription());
            current.setCreatedDate(newItem.getCreatedDate());
            current.setPrice(newItem.getPrice());
            current.setUser(newItem.getUser());
            return itemRepository.save(current);
        } else{
            return null;
        }
    }










}
