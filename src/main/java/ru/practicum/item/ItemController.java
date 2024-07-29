package ru.practicum.item;

import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CommonsLog
@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping
    List<Item> getAllItems(@RequestHeader("X-Later-UserID") Long userID){
        log.debug(userID);
        return itemService.getAllItems(userID);
    }

    @PostMapping
    String addNewItem(
            @RequestHeader("X-Later-UserID") Long userID,
            @RequestBody Item item){
        log.debug(userID);
        return itemService.addNewItem(item);
    }

    @DeleteMapping
    public String deleteItemByID(
            @RequestHeader("X-Later-UserID") Long userID,
            @RequestHeader int itemID){
        log.debug(userID);
        return itemService.deleteByID(itemID);
    }
}
