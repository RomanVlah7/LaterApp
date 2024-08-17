package project.user;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    UserRep userDao;

    public User saveUser(User user){
        return userDao.saveUser(user);
    }

    public User editUser(User user){
        userDao.editUser(user);
        return user;
    }

    public List<UserDto> findAll(){
        return userDao.findAll();
    }

    public void deleteById(Long itemId){
        userDao.deleteById(itemId);
    }
}
