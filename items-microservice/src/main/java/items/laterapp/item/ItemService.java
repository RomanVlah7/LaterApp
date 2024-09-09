package items.laterapp.item;


import items.laterapp.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    /*this is a service for Item Class, it is a layer between Controller and repository class*/

    @Autowired
    KafkaProducer kafkaProducer;
    @Autowired
    private ItemRep itemRep;

    public Item saveItem(Item item) {
        Item result = itemRep.saveItem(item);
        kafkaProducer.sendToItemNotificationTopic(item.authorInfo.getUserId().toString());
        return result;
    }

    public List<ItemDto> findAll() {
        return itemRep.findAll();
    }

    public List<ItemDto> findAllItemsOfUser(Long userId){
        return itemRep.findAllItemsOfUser(userId);
    }

    public ItemDto findItemById(Long itemId){
        return itemRep.findItemById(itemId);
    }

    public void deleteById(Long itemId) {
        itemRep.deleteById(itemId);
    }
}
