package notification.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserKafkaConsumer {

    private static final Logger log = LoggerFactory.getLogger(UserKafkaConsumer.class);
    @Autowired
    UserService userService;

    @KafkaListener(topics = "user-notification-topic", groupId = "user-items-to-notification")
    public void sendUserNotification(String userEmail){
        log.info("received kafka message");
        userService.sendNotification(userEmail);
    }

}
