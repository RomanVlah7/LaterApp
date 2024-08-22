package notification.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notif")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping("new-item")
    public void sendNotification(@RequestBody ItemDto item){
        itemService.sendNotification(item.getUserID());
    }

}
