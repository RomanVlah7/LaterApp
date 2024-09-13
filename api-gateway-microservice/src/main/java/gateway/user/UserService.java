package gateway.user;



import gateway.exceptions.ExceptionHandlers;
import gateway.exceptions.exceptions.UserAlreadyExistsException;
import gateway.exceptions.exceptions.UserNotFounfException;
import gateway.tools.LogTools;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserService {
    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    /*This is UserService, it processes the tha data which comes from
    UserController (UserController call methods from UserService)*/

    RestTemplate restTemplate = new RestTemplate();
    @Autowired
    private LogTools logTools;

    public User getUserById(Long userId){
         User result = restTemplate.getForEntity("http://localhost:84/users/get-user-by-id/"
                + userId, User.class).getBody();
         logTools.logMethodInfoDebug(userId.toString(), log);
         return result;
    }

/*    public ResponseEntity<Map<String, String>> tryToSaveUser(User user) {
        User result = getUserById(user.getUserId());
        //todo add here a validation using login and password or just save users without validation

        if(result!= null){
            return ExceptionHandlers.userAlreadyExistsException(new UserAlreadyExistsException());
        } else {
            User savedUser = saveUser(user);
            return new ResponseEntity<>(
                    Map.of(savedUser.toString(), "200"),
                    HttpStatus.OK
            );
        }
    }*/

    public User saveUser(User user){
        logTools.logMethodInfoDebug(user.toString(), log);
        return restTemplate.postForObject("http://localhost:84/users/save-user", user, User.class);
    }

    public ResponseEntity<Map<String, String>> findUserById(Long userId){
        //this method is used to find user in db and return it to as a response
        User result = restTemplate.getForEntity("http://localhost:84/users/get-user-by-id/"
                + userId.toString(), User.class).getBody();
        if(result.equals(null)){
            logTools.logMethodInfoDebug(userId.toString(), log);
            return ExceptionHandlers.userNotFoundException(new UserNotFounfException());
        } else {
            logTools.logMethodInfoDebug(userId.toString(), log);
            return new ResponseEntity<>(
                    Map.of(result.toString(), "200"),
                    HttpStatus.OK
            );
        }
    }

    public ResponseEntity<Map<String, String>> deleteUserById(Long userId){
        restTemplate.delete("http://localhost:84/users/delete-user/" + userId.toString());
        logTools.logMethodInfoDebug(userId.toString(), log);
        return new ResponseEntity<>(
                Map.of("User was deleted successful", "200"),
                HttpStatus.OK
        );
    }
}
