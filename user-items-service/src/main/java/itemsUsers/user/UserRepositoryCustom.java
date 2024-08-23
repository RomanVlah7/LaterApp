package itemsUsers.user;

import java.util.List;

public interface UserRepositoryCustom {

    /*we can use reflection and spring queries to process custom SQL/JPQL queries*/

    List<UserDto> findAllUsersUsingDto();
}
