package gateway.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


/*this is a data transfer class, it is a copy of class User but without confidential data*/

public class UserDto {
    private Long userId;
    private String email;
}
