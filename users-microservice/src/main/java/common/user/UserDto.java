package common.user;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")

/*this is a data transfer class, it is a copy of class User but without confidential data*/

public class UserDto {
    @Id
    private Long userId;
    @Column(name = "email")
    private String email;
}
