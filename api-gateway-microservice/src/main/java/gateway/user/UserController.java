package gateway.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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
    public ResponseEntity<Map<String, String>> newUser(@RequestBody User user) {
        return userService.tryToSaveUser(user);
    }

    //--------------Delete Mapping-----------------

    @DeleteMapping("/delete-user-by-id")
    public ResponseEntity<Map<String, String>> deleteUser (Long userId){
        return userService.deleteUserById(userId);
    }
}
