package project.user;

import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepositoryCustom {
    List<UserDto> findAllUsersUsingDto();
}
