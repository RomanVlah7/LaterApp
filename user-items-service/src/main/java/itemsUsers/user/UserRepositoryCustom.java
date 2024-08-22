package itemsUsers.user;

import java.util.List;

public interface UserRepositoryCustom {
    List<UserDto> findAllUsersUsingDto();
}
