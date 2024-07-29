package ru.practicum.item;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ItemRepository {

    private static ArrayList<Item> items = new ArrayList<>();

    public List<Item> getAllItemsFromStorage() {
        return items;
    }

    public String addNewItemToStorage(Item item) {
        items.add(item);
        return "Added Successfully";
    }

    public String deleteByIDFromStorage(long itemID) {
        boolean removedSuccessful = false;
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).getId() == itemID){
                items.remove(i);
                removedSuccessful = true;
            }
        }
        if (removedSuccessful){
            return "Removed Successful";
        } else {
            return "Could not remove";
        }
    }
}
