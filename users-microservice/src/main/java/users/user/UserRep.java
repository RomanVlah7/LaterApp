package users.user;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import users.user.User;
import users.user.UserRepository;
import users.user.UserRepositoryCustomImpl;

import java.util.List;
import java.util.Optional;

@Component
public class UserRep {

    /*this is a user repository class, an implementation of repository interface interact with database */

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserRepositoryCustomImpl userRepositoryCustom;
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public User saveUser(User user) {
        entityManager.persist(user);
        return user;
    }

    @Transactional
    public User editUser(User user) {
        entityManager.persist(user);
        return user;
    }

    @Transactional
    public Optional<User> getById(Long userId) {
        return userRepository.findById(userId);
    }

    @Transactional
    public List<UserDto> findAll() {
        return userRepositoryCustom.findAllUsersUsingDto();
    }

    @Transactional
    public void deleteById(Long userId) {
        userRepository.deleteById(userId);
    }
}
