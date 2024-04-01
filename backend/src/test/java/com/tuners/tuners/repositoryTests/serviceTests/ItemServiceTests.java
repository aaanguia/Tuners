package com.tuners.tuners.repositoryTests.serviceTests;

import com.tuners.tuners.Models.ItemModel;
import com.tuners.tuners.Repository.ItemMongoRepository;
import com.tuners.tuners.Services.ItemService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(SpringExtension.class)
public class ItemServiceTests {

    @Mock
    private ItemMongoRepository itemRepository;

    @InjectMocks
    private ItemService itemService;

    @Test
    public void saveItemTest(){
        ItemModel item = new ItemModel( "testid","itemname", "src/fsdfs" ,"desc", "2014-10-23", 10.0 , 5);
        itemService.saveItem(item);
        verify(itemRepository, times(1)).save(item);
    }

    @Test
    public void getItemsTest(){
        itemService.getItems();
        verify(itemRepository, times(1)).findAll();
    }

    @Test
    public void getItemByIdTest(){
        itemService.getItemById("string");
        verify(itemRepository, times(1)).findById("string");
    }

    @Test
    public void deleteItemTest(){
        itemService.deleteItem("string");
        verify(itemRepository, times(1)).deleteById("string");
    }

}
