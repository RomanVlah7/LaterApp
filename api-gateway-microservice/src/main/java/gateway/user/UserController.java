package gateway.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.zalando.logbook.Logbook;

import java.util.Map;
@RestController
@RequestMapping("/later-app-api")
public class UserController {
    @Autowired
    private UserService userService;

    //------------------Get Mapping-------------------

   @GetMapping("/get-user-by-id")
   public ResponseEntity<Map<String, String>> findUserById(@RequestParam Long userId){
       return userService.findUserById(userId);
   }

    //---------------Post Mapping---------------------

    @PostMapping("/new-user")
    public User newUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    //--------------Delete Mapping-----------------

    @DeleteMapping("/delete-user-by-id")
    public ResponseEntity<Map<String, String>> deleteUser (@RequestParam Long userId){
        return userService.deleteUserById(userId);
    }
}
