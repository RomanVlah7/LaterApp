package notification.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ItemKafkaConsumer {
    @Autowired
    private ItemService itemService;

    @KafkaListener(topics = "item-notificationsssssss-topic",groupId = "user-items-to-notification")
    public void sendItemNotification(String userWhoMadePost){
        Long userId = Long.parseLong(userWhoMadePost);
        itemService.sendNotification(userId);
    }

}
