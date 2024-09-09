package users.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    /*this is a repository to implement basic CRUD operations to repository class*/

}
