package gateway.item;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CommonsLog
@RestController
@RequestMapping("/later-app-api")
public class ItemController {

    /*this class is a controller class to process HTTP requests
     * I use basic scheme to process requests Controller -> Service */

    @Autowired
    private ItemService itemService;


    //--------Get Mapping-------------

    @GetMapping("/find-all-items")
    public List<ItemDto> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/get-item")
    public ItemDto findItemById(@RequestParam Long itemId){
        return itemService.getItemById(itemId);
    }

    @GetMapping("get-items-of-user")
    public List<ItemDto> findAllItemsOfUser(@RequestParam Long userId){
        return itemService.getAllItemsOfUser(userId);
    }

    //--------Post Mapping------------

    @PostMapping("/save-item")
    public ResponseEntity<String> saveItem(@RequestBody ItemDto item) {
        return itemService.saveItem(item);
    }

    //----------Delete Mapping

    @DeleteMapping("/delete-item")
    public ResponseEntity<String> deleteById(@RequestBody Long itemId) {
        return itemService.deleteItemById(itemId);
    }

}
