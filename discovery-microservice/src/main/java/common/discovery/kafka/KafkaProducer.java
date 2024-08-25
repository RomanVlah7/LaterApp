package common.discovery.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendToUserNotificationTopic(String message){
        kafkaTemplate.send("user-notification-topic", message);
    }

    public void sendToItemNotificationTopic(String message){
        kafkaTemplate.send("item-notification-topic", message);
    }

}
