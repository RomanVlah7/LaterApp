package users.user;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import users.tools.LogTools;
import users.user.User;
import users.user.UserRepository;
import users.user.UserRepositoryCustomImpl;

import java.util.List;
import java.util.Optional;

@Component
public class UserRep {
    private static final Logger log = LoggerFactory.getLogger(UserRep.class);

    /*this is a user repository class, an implementation of repository interface interact with database */

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserRepositoryCustomImpl userRepositoryCustom;
    @Autowired
    private EntityManager entityManager;
    @Autowired
    private LogTools logTools;

    @Transactional
    public User saveUser(User user) {
        entityManager.persist(user);
        logTools.logMethodInfoDebug(user.toString(), log);
        return user;
    }

    @Transactional
    public User editUser(User user) {
        entityManager.persist(user);
        logTools.logMethodInfoDebug(user.toString(), log);
        return user;
    }

    @Transactional
    public Optional<User> getById(Long userId) {
        logTools.logMethodInfoDebug(userId.toString(), log);
        return userRepository.findById(userId);
    }

    @Transactional
    public List<UserDto> findAll() {;
        return userRepositoryCustom.findAllUsersUsingDto();
    }

    @Transactional
    public void deleteById(Long userId) {
        logTools.logMethodInfoDebug(userId.toString(), log);
        userRepository.deleteById(userId);
    }
}
