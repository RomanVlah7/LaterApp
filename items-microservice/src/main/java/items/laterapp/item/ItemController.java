package items.laterapp.item;

import items.laterapp.tools.LogTools;
import lombok.extern.apachecommons.CommonsLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zalando.logbook.Logbook;

import java.util.List;


@RestController
@RequestMapping("/items")
public class ItemController {


    /*this class is a controller class to process HTTP requests
     * I use basic scheme to process requests Controller -> Service -> Repository class */


    @Autowired
    private ItemService itemService;
    @Autowired
    private LogTools logTools;
    private static final Logger log = LoggerFactory.getLogger(ItemController.class);




    //--------Get Mapping-------------

    @GetMapping("/find-all-items")
    public List<ItemDto> getAllItems() {
        return itemService.findAll();
    }

    @GetMapping("/get-item/{itemId}")
    public List<ItemDto> findItemById(@PathVariable Long itemId){
        logTools.logMethodInfoDebug(itemId.toString(), log);
        return itemService.findItemById(itemId);
    }

    @GetMapping("get-items-of-user/{userId}")
    public List<ItemDto> findAllItemsOfUser(@PathVariable Long userId){
        logTools.logMethodInfoDebug(userId.toString(), log);
        return itemService.findAllItemsOfUser(userId);
    }

    //--------Post Mapping------------

    @PostMapping("/save-item")
    public Item saveItem(@RequestBody Item item) {
        logTools.logMethodInfoDebug(item.toString(), log);
        return itemService.saveItem(item);
    }

    //----------Delete Mapping

    @DeleteMapping("/delete-item")
    public void deleteById(@RequestBody Long itemId) {
        logTools.logMethodInfoDebug(itemId.toString(),log);
        itemService.deleteById(itemId);
    }

}
