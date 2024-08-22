package itemsUsers.item;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CommonsLog
@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping("/save-item")
    public Item saveItem(@RequestBody Item item) {
        return itemService.saveItem(item);
    }

    @GetMapping("/find-all-items")
    public List<Item> getAllItems() {
        return itemService.findAll();
    }

    @DeleteMapping("/delete-item")
    public void deleteById(@RequestBody Long itemId) {
        itemService.deleteById(itemId);
    }


    /*@GetMapping
    List<Item> findAll(@RequestHeader("X-Later-UserID") Long userID){
        log.debug(userID);
        return itemService.findAll(userID);
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
    }*/
}
