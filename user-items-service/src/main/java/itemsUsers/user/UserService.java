package itemsUsers.user;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    UserRep userDao;

    public User saveUser(User user) {
        userDao.saveUser(user);
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("http://localhost:81/notif/new-item"))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(user.getEmail()))
                    .build();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

        String email = user.getEmail();
        return user;
    }

    public User editUser(User user) {
        userDao.editUser(user);
        return user;
    }

    public List<UserDto> findAll() {
        return userDao.findAll();
    }

    public void deleteById(Long itemId) {
        userDao.deleteById(itemId);
    }
}
