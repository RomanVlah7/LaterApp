package gateway.user;

public class UserMapper {

    public UserDto userToDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setUserId((user.getUserId()));
        return userDto;
    }
}
