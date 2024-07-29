package ru.practicum.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;
    public List<Item> getAllItems(Long UserID) {
        return itemRepository.getAllItemsFromStorage();
    }

    public String addNewItem(Item item) {
        return itemRepository.addNewItemToStorage(item);
    }

    public String deleteByID(long itemID) {
        return itemRepository.deleteByIDFromStorage(itemID);
    }
}
