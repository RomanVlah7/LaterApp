package itemsUsers.user;

public class UserMapper {

    public UserDto userToDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setUserId((user.getUserId()));
/*        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());*/
        return userDto;
    }
}
