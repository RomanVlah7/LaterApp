package common.user;

import itemsUsers.kafka.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService {

    /*This is UserService, it processes the tha data which comes from
    UserController (UserController call methods from UserService)*/

    @Autowired
    UserRep userDao;

    @Autowired
    KafkaProducer kafkaProducer;

    public User saveUser(User user) {
        userDao.saveUser(user);
        kafkaProducer.sendToUserNotificationTopic(user.getEmail());
        return user;
    }

    public User editUser(User user) {
        userDao.editUser(user);
        return user;
    }

    public List<UserDto> findAll() {
        return userDao.findAll();
    }

    public void deleteById(Long itemId) {
        userDao.deleteById(itemId);
    }
}
