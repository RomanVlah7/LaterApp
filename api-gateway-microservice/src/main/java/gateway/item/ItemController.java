package gateway.item;

import gateway.tools.LogTools;
import lombok.extern.apachecommons.CommonsLog;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.zalando.logbook.Logbook;

import java.util.List;
import java.util.logging.Logger;


@RestController
@RequestMapping("/later-app-api")
public class ItemController {

    /*this class is a controller class to process HTTP requests
     * I use basic scheme to process requests Controller -> Service */

    @Autowired
    private ItemService itemService;
    @Autowired
    private LogTools logTools;

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(LogTools.class);



    //--------Get Mapping-------------

    @GetMapping("/find-all-items")
    public List<ItemDto> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/get-item")
    public List<ItemDto> findItemById(@RequestParam Long itemId){
        logTools.logMethodInfoDebug(itemId.toString(), log);
        return itemService.getItemById(itemId);
    }

    @GetMapping("/get-items-of-user")
    public List<ItemDto> findAllItemsOfUser(@RequestParam Long userId){
        logTools.logMethodInfoDebug(userId.toString(), log);
        return itemService.getAllItemsOfUser(userId);
    }

    //--------Post Mapping------------

    @PostMapping("/save-item")
    public Item saveItem(@RequestBody Item item) {
        logTools.logMethodInfoDebug(item.toString(), log);
        return itemService.saveItem(item);
    }

    //----------Delete Mapping

    @DeleteMapping("/delete-item")
    public ResponseEntity<String> deleteById(@RequestBody Long itemId) {
        logTools.logMethodInfoDebug(itemId.toString(), log);
        return itemService.deleteItemById(itemId);
    }

}
