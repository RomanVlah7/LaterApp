package notification.user;

import notification.email.EmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final Logger log = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private EmailService emailService;

    public void sendNotification(String to) {
        String subject = "New user";
        String text = "Welcome to 'Later' Application! This service allow you to store bookmarks to you favorite internet resources and share it with the whole world!";
        log.info("Notification: " + text);
        //emailService.sendEmail(to, subject, text);
    }
}
