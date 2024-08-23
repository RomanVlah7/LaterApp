package itemsUsers.item;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CommonsLog
@RestController
@RequestMapping("/items")
public class ItemController {


    /*this class is a controller class to process HTTP requests
     * I use basic scheme to process requests Controller -> Service -> Repository class */



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

}
