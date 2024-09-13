package gateway.user;


import gateway.tools.LogTools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.zalando.logbook.Logbook;

import java.util.Map;
@RestController
@RequestMapping("/later-app-api")
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    @Autowired
    private LogTools logTools;


    //------------------Get Mapping-------------------

   @GetMapping("/get-user-by-id")
   public ResponseEntity<Map<String, String>> findUserById(@RequestParam Long userId){
       logTools.logMethodInfoDebug(userId.toString(), log);
       return userService.findUserById(userId);
   }

    //---------------Post Mapping---------------------

    @PostMapping("/new-user")
    public User newUser(@RequestBody User user) {
       logTools.logMethodInfoDebug(user.toString(), log);
        return userService.saveUser(user);
    }

    //--------------Delete Mapping-----------------

    @DeleteMapping("/delete-user-by-id")
    public ResponseEntity<Map<String, String>> deleteUser (@RequestParam Long userId){
       logTools.logMethodInfoDebug(userId.toString(), log);
       return userService.deleteUserById(userId);
    }
}
