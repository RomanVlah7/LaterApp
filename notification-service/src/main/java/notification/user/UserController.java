package notification.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notif")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;

    @PostMapping("/new-user")
    public void sendNotification(@RequestBody String userEmail) {
        log.info("Method send notification is working");
        userService.sendNotification(userEmail);
    }
}