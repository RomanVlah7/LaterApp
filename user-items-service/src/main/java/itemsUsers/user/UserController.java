package itemsUsers.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/save-user")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PatchMapping("/edit-user")
    public User editUser(User user) {
        userService.editUser(user);
        return user;
    }

    @GetMapping("/find-all-users")
    public List<UserDto> findAll() {
        return userService.findAll();
    }

    @DeleteMapping("/delete-user")
    public void deleteById(@RequestBody Long itemId) {
        userService.deleteById(itemId);
    }

}