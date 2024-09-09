package discovery.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {

    @Bean
    public NewTopic newItemNotificationTopic() {
        return new NewTopic("item-notification-topic", 1, (short) 1);
    }

    @Bean
    public NewTopic newUserNotificationTopic() {
        return new NewTopic("user-notification-topic", 1, (short) 1);
    }
}
