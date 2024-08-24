package itemsUsers.item;

import itemsUsers.kafka.KafkaProducer;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    /*this is a service for Item Class, it is a layer between Controller and repository class*/

    static Class<String> Object;
    EntityManager entityManager;
    @Autowired
    private ItemRep itemRep;
    @Autowired
    KafkaProducer kafkaProducer;

    public Item saveItem(Item item) {
        Item result = itemRep.saveItem(item);
        kafkaProducer.sendToItemNotificationTopic(item.authorInfo.getUserId().toString());
        return result;
    }

    public List<Item> findAll() {
        return itemRep.findAll();
    }

    public void deleteById(Long itemId) {
        itemRep.deleteById(itemId);
    }
}
