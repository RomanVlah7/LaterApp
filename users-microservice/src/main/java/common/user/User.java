package common.user;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@Table(name = "users")
public class User {

    /*this class represents an entity from database*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Getter
    @Column(name = "email")
    private String email;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "user_state")
    @Enumerated(EnumType.STRING)
    private UserState userState;

    @Column(name = "user_password")
    private String password;

    @Column(name = "user_login")
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
