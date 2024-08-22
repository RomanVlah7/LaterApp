package notification.item;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import notification.email.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    private static final Logger log = LoggerFactory.getLogger(ItemService.class);
    @Autowired
    private EmailService emailService;

    public void sendNotification(Long userIdWhoMadePost) {
        String subject = "New item";
        String text = new String("User " + userIdWhoMadePost + "has made a new post");
        log.info("Notification: {}", text);
        //emailService.sendEmail(to, subject, text);
    }
}
