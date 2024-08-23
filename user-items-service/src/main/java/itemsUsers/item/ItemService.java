package itemsUsers.item;

import itemsUsers.kafka.KafkaProducer;
import itemsUsers.user.UserDto;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import itemsUsers.item.Item;
import itemsUsers.item.ItemRep;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
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
        kafkaProducer.sendMessage(item.authorInfo.getUserId().toString());

        return result;
    }

    public List<Item> findAll() {
        return itemRep.findAll();
    }

    public void deleteById(Long itemId) {
        itemRep.deleteById(itemId);
    }
}
