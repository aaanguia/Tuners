package com.tuners.tuners.repositoryTests.controllerTests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tuners.tuners.Controllers.ItemController;
import com.tuners.tuners.Models.ItemModel;
import com.tuners.tuners.Services.ItemService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ItemController.class)
public class ItemControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @MockBean
    private ItemService itemService;

    @Test
    public void addItemTest() throws Exception{
        ItemModel item = new ItemModel( "testid","itemname", "src/fsdfs" ,"desc", "2014-10-23", 10.0 , 5);
        mockMvc.perform(MockMvcRequestBuilders.post("/addItem")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(item)));
        verify(itemService, times(1)).saveItem(any(ItemModel.class));
    }

    @Test
    public void getInventoryTest() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/inventory")
                .contentType(MediaType.APPLICATION_JSON));
        verify(itemService, times(1)).getItems();
    }


    @Test
    public void getItemtByIdTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/inventory/1")
                .contentType(MediaType.APPLICATION_JSON));
        verify(itemService, times(1)).getItemById("1");
    }

    @Test
    public void deleteByIdTest() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.delete("/delete/1")
                .contentType(MediaType.APPLICATION_JSON));
        verify(itemService, times(1)).deleteItem("1");
    }








}
