package gateway.user;

import gateway.user.UserState;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor

public class User {

    /*this class represents an entity from database*/


/*    private Long userId;*/ //i will try to send this class as a json without field id

    @Getter
    private String email;
    private String firstName;
    private String lastName;
    private UserState userState;
    private String password;
    private String login;

    public User(String email, String firstName, String lastName, UserState userState,
                String password, String login) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userState = userState;
        this.password = password;
        this.login = login;
    }
}
