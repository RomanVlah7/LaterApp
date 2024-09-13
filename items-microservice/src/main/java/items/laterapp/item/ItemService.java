package items.laterapp.item;


import items.laterapp.kafka.KafkaProducer;
import items.laterapp.tools.LogTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    /*this is a service for Item Class, it is a layer between Controller and repository class*/
    private static final Logger log = LoggerFactory.getLogger(ItemService.class);
    @Autowired
    KafkaProducer kafkaProducer;
    @Autowired
    private ItemRep itemRep;
    @Autowired
    private LogTools logTools;

    public Item saveItem(Item item) {
        Item result = itemRep.saveItem(item);
        kafkaProducer.sendToItemNotificationTopic(item.authorInfo.getUserId().toString());
        logTools.logMethodInfoDebug(item.toString(), log);
        return result;
    }

    public List<ItemDto> findAll() {
        return itemRep.findAll();
    }

    public List<ItemDto> findAllItemsOfUser(Long userId){
        logTools.logMethodInfoDebug(userId.toString(), log);
        return itemRep.findAllItemsOfUser(userId);
    }

    public List<ItemDto> findItemById(Long itemId){
        logTools.logMethodInfoDebug(itemId.toString(), log);
        return itemRep.findItemById(itemId);
    }

    public void deleteById(Long itemId) {
        logTools.logMethodInfoDebug(itemRep.toString(), log);
        itemRep.deleteById(itemId);
    }
}
