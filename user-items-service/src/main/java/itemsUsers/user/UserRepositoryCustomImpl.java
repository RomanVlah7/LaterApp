package itemsUsers.user;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryCustomImpl implements UserRepositoryCustom {

    /*this method is implementation for custom queries to DB from interface 'UserRepositoryCustom' */
    @Autowired
    EntityManager entityManager;

    @Override
    public List<UserDto> findAllUsersUsingDto() {
        return entityManager.createQuery("SELECT u.userId, u.firstName, u.lastName FROM UserDto u", UserDto.class).getResultList();
    }
}
