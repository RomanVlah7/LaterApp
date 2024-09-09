package users.user;


import users.kafka.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserService {

    /*This is UserService, it processes the tha data which comes from
    UserController (UserController call methods from UserService)*/

    @Autowired
    UserRep userRep;

    @Autowired
    KafkaProducer kafkaProducer;

    public User saveUser(User user) {
        userRep.saveUser(user);
        kafkaProducer.sendToUserNotificationTopic(user.getEmail());
        return user;
    }

    public User editUser(User user) {
        userRep.editUser(user);
        return user;
    }

    public Optional<User> getById(Long userId) {
        return userRep.getById(userId);
    }

    public List<UserDto> findAll() {
        return userRep.findAll();
    }

    public ResponseEntity<Map<String, String>> deleteById(Long userId) {
        userRep.deleteById(userId);
        return new ResponseEntity<>(
                Map.of("User was deleted successful", "200"),
                HttpStatus.OK
        );
    }
}
