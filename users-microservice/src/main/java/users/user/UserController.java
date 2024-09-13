package users.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.zalando.logbook.Logbook;
import users.tools.LogTools;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    /*this class is a controller class to process HTTP requests
     * I use basic scheme2 to process requests Controller -> Service -> Repository class */

    @Autowired
    private UserService userService;
    @Autowired
    private LogTools logTools;

    //-----------Get Mapping-----------------

    @GetMapping("/find-all-users")
    public List<UserDto> findAll() {
        return userService.findAll();
    }

    @GetMapping("/get-user-by-id/{userId}")
    public User findById(@PathVariable Long userId) {
        logTools.logMethodInfoDebug(userId.toString(),log);
        return userService.getById(userId).orElse(null);
    }

    //------------Post Mapping-----------------

    @PostMapping("/save-user")
    public User saveUser(@RequestBody User user) {
        logTools.logMethodInfoDebug(user.toString(),log);
        return userService.saveUser(user);
    }

    //-----------Patch Mapping------------------

    @PatchMapping("/edit-user")
    public User editUser(User user) {
        userService.editUser(user);
        logTools.logMethodInfoDebug(user.toString(),log);
        return user;
    }

    //--------Delete Mapping--------------------

    @DeleteMapping("/delete-user/{userId}")
    public ResponseEntity<Map<String, String>> deleteById(@PathVariable Long userId) {
        logTools.logMethodInfoDebug(userId.toString(),log);
        return userService.deleteById(userId);
    }


}